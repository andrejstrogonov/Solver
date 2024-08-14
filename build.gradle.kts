plugins {
    id("java")
    id ("info.solidsoft.pitest") version "1.15.0"
}

group = "com.andrejstrogonov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.12.0")

}

tasks.test {
    useJUnitPlatform()
}

configure<info.solidsoft.gradle.pitest.PitestPluginExtension> {
    junit5PluginVersion.set("1.0.0")
    avoidCallsTo.set(setOf("kotlin.jvm.internal"))
    mutators.set(setOf("STRONGER"))
    targetClasses.set(setOf("pitest.test.*"))  //by default "${project.group}.*"
    targetTests.set(setOf("pitest.test.*Test"))
//    pitestVersion.set("1.4.0")   //current defined for Gradle plugin PIT version should be used
    threads.set(Runtime.getRuntime().availableProcessors())
    outputFormats.set(setOf("XML", "HTML"))
}