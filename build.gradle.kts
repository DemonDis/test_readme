plugins {
    kotlin("jvm") version "2.1.0"
    application
}

application {
    mainClass = "MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
