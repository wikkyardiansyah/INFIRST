allprojects {}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
