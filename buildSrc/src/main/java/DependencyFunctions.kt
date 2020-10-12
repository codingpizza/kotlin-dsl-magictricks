import org.gradle.api.artifacts.dsl.DependencyHandler

const val ANDROID_TEST_IMPLEMENTATION = "androidTestImplementation"
const val ANDROID_IMPLEMENTATION = "implementation"
const val TEST_IMPLEMENTATION = "testImplementation"

fun DependencyHandler.implementAndroidTestLibraries() {
    add(ANDROID_TEST_IMPLEMENTATION, Dependencies.ANDROIDX_JUNIT)
    add(ANDROID_TEST_IMPLEMENTATION, Dependencies.ANDROIDX_TEST_ESPRESSO)
}

fun DependencyHandler.implementAndroidDefaultLibraries() {
    add(ANDROID_IMPLEMENTATION, Dependencies.ANDROIDX_CORE_KTX)
    add(ANDROID_IMPLEMENTATION, Dependencies.ANDROIDX_APPCOMPAT)
    add(ANDROID_IMPLEMENTATION, Dependencies.ANDROIDX_CONSTRAINTLAYOUT)
}

fun DependencyHandler.implementTestLibraries() {
    add(TEST_IMPLEMENTATION, Dependencies.JUNIT)
}

