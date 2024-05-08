rootProject.name="test"

pluginManagement {
    val micronautVersion: String by settings
    val kotlinVersion: String by settings
    val kspVersion: String by settings
    val shadowVersion: String by settings

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
        id("com.google.devtools.ksp") version kspVersion
        
        id("io.micronaut.application") version micronautVersion
        id("io.micronaut.aot") version micronautVersion
        id("io.micronaut.library") version micronautVersion
        id("com.github.johnrengelman.shadow") version shadowVersion
    }
}

// Problem can fix by comment this line - subproject contains micronut library gradle plugin
include(":test:test-api")

include(":test:test-service")
