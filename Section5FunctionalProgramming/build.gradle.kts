import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.30"
    application
}

group = "me.devce"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}


dependencies {
    testImplementation(kotlin("test-junit"))
    implementation ("org.funktionale:funktionale-all:1.2")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}






