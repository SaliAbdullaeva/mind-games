import java.util.Date
plugins {
    id("com.github.ben-manes.versions") version "0.51.0"
    id("application")
    id("checkstyle")
}

checkstyle {
    toolVersion = "10.16.0" // Укажите нужную версию Checkstyle
}
//Пример 3. Настройка HTML-отчета
tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required = false
        html.required = true
        html.stylesheet = resources.text.fromFile("config/checkstyle/checkstyle.xml")
    }
}
//Пример 4. Включить отчет SARIF
tasks.withType<Checkstyle>().configureEach {
    reports {
        sarif.required = true
    }
}
//Пример 5. Настройка объема памяти, отдаваемой Checkstyle
tasks.withType<Checkstyle>().configureEach {
    minHeapSize = "200m"
    maxHeapSize = "1g"
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
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.puppycrawl.tools:checkstyle:10.16.0")
}

tasks.test {
    useJUnitPlatform()
}
application {
    // Указываем точку входа в приложение
    mainClass = "hexlet.code.App"
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

