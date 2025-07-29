plugins {
    kotlin("jvm") version "2.1.10" // ✔ ok, versão mais nova
    application // ✔ importante
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() // ✔ fonte dos pacotes
}

dependencies {
    implementation("mysql:mysql-connector-java:8.3.0") // ✔ necessário
}

tasks.test {
    useJUnitPlatform() // ✔ testes (não interfere na conexão)
}

kotlin {
    jvmToolchain(23) // ✔ Java 23 (se sua máquina suporta, tudo certo)
}

// FALTA declarar o ponto de entrada da aplicação
application {
    mainClass.set("MainKt") // 👈 coloque o nome do seu arquivo principal sem extensão
}
