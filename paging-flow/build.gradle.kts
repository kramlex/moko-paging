/*
 * Copyright 2022 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("dev.icerock.moko.gradle.multiplatform.mobile")
    id("dev.icerock.moko.gradle.publication")
    id("dev.icerock.moko.gradle.stub.javadoc")
    id("dev.icerock.moko.gradle.detekt")
}

dependencies {
    commonMainApi(libs.mokoMvvmFlow)
    commonMainApi(libs.mokoMvvmCore)
    commonMainApi(projects.pagingCore)
    commonMainApi(projects.pagingState)

    commonTestImplementation(projects.pagingTest)
}
