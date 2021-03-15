plugins {
    id("factlin")
    kotlin("jvm") version "1.4.10"
}


repositories {
    mavenCentral()
}


dependencies {
//    implementation("io.micronaut:micronaut-http-client")
}

factlin {
    dbUrl = "jdbc:postgresql://{DB_HOST}/{DB_NAME}"
    dbUser = "{DB_USER}"
    dbPassword = "{DB_PASS}"
    dbDialect = "postgres"
}
