import java.util.Date

plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.51.0"
    id("application")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

//tasks.jar {
    //manifest {
        //attributes["Main-Class"] = "hexlet.code.App"
        //attributes["Implementation-Version"] = version
        //attributes["Built-By"] = System.getProperty("user.name")
        //attributes["Built-Date"] = Date()
    //}
//}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
application {
    // Указываем точку входа в приложение
    mainClass = "hexlet.code.App"
}
