/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("dev.icerock.moko.gradle.multiplatform.mobile")
    id("dev.icerock.moko.gradle.publication")
    id("dev.icerock.moko.gradle.stub.javadoc")
    id("dev.icerock.moko.gradle.detekt")
}

dependencies {
    commonMainApi(projects.pagingCore)
    commonMainApi(libs.kotlinTestJUnit)
    commonMainApi(libs.ktorClient)
    commonMainApi(libs.ktorClientMock)

    androidMainApi(libs.androidCoreTesting)
    iosMainApi(libs.coroutines)
}
