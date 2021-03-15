plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("com.maeharin:factlin:0.3.0")
    implementation("org.postgresql:postgresql:42.1.4")
}