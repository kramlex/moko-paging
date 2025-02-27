/*
 * Copyright 2022 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.paging.state

fun <T, E> T.asState(): ResourceState<T, E> =
    ResourceState.Data(this)

fun <T, E> T?.asState(whenNull: () -> ResourceState<T, E>): ResourceState<T, E> =
    this?.asState() ?: whenNull()

fun <T, E> List<T>.asState(): ResourceState<List<T>, E> = if (this.isEmpty()) {
    ResourceState.Empty
} else {
    ResourceState.Data(this)
}

fun <T, E : Throwable> E.asState(): ResourceState<List<T>, E> =
    ResourceState.Error(this)

fun <T, E> List<T>?.asState(whenNull: () -> ResourceState<List<T>, E>): ResourceState<List<T>, E> =
    this?.asState() ?: whenNull()

inline fun <reified T, reified E> ResourceState<T, E>?.nullAsEmpty(): ResourceState<T, E> =
    this ?: ResourceState.Empty

inline fun <reified T, reified E> ResourceState<T, E>?.nullAsLoading(): ResourceState<T, E> =
    this ?: ResourceState.Loading
