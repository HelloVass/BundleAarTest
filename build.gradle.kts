plugins {
    id("com.android.application") version "4.0.0" apply false
    id("com.android.library") version "4.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.5.20" apply false
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}