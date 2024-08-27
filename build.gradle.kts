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
    implementation("org.pitest:pitest:1.16.1")
    implementation("org.pitest:pitest-junit5-plugin:1.2.1")
    implementation("org.springframework.boot:spring-boot-docker-compose:3.1.1")
    implementation("org.springframework.boot:spring-boot-starter-parent:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.3")
    implementation("org.springframework:spring-web:6.1.12")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.12.0")

}

tasks.test {
    useJUnitPlatform()
}
