plugins { id("com.android.application") }
android {
    namespace = "com.mibiblioteca.lector"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.mibiblioteca.lector"
        minSdk = 26
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies { implementation("androidx.webkit:webkit:1.11.0") }
