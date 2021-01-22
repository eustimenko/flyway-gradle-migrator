plugins {
    java
    id("org.flywaydb.flyway") version "7.5.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hsqldb:hsqldb:2.5.1")
}

tasks.named("flywayMigrate") {
    dependsOn("classes")
}