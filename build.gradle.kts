plugins {
    id("java")
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
    testImplementation("junit:junit")
    testImplementation("org.mockito:mockito-core")
}

tasks.test {
    useJUnitPlatform()
}