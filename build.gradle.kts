plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    //testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    //implementation("commons-cli:commons-cli:20040117.000000")
    implementation("io.github.qsy7.java.dependencies:commons-cli:0.1.2")
    implementation("org.testng:testng:7.5")
}

tasks.getByName<Test>("test") {
    useTestNG()
}