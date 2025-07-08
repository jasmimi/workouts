plugins {
    application
    kotlin("jvm") version "1.9.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.12")
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation(kotlin("stdlib"))
    implementation("org.mongodb:mongodb-driver-sync:4.11.1")
    implementation(libs.guava)
    testImplementation(libs.junit)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

kotlin {
    jvmToolchain(20) // match the Java version you're using
}

application {
    mainClass.set("org.workouts.App")
}
