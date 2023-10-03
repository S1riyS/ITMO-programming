val MAIN_CLASS = "lab2.Main"

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
}

dependencies {
    // implementation(files("libs/Pokemon.jar"))
    implementation(fileTree("libs") { include("*.jar") })
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    // Define the main class for the application.
    mainClass.set(MAIN_CLASS)
}

tasks.jar {
    manifest.attributes["Main-Class"] = MAIN_CLASS
    val dependencies = configurations.runtimeClasspath.get().map(::zipTree) // OR .map { zipTree(it) }
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}