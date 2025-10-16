plugins{
    id("com.android.application")
    kotlin("android")
    id("com.google.dagger.hilt.android")
    ksp
}

android{
    namespace="com.company.supermarket"
    compileSdk=35
    defaultConfig{
        applicationId = "com.company.supermarket"
        minSdk=24
        targetSkd=35
        vectorDrawables.useSupportLibrary = true
    }
    buildFeatures {compose = true}
    composeOptions {kotlinCompilerExtensionVersion ="1.5.15"}
}

dependecies{
    //Compose
    implementation(platform("androidx.compose:compose-bom:2025.01.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.navigation:navigation-compose:2.8.0")
    implementation("io.coil-kt:coil-compose:2.7.0")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.4")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.52")
    ksp("com.google.dagger:hilt-compiler:2.52")

    // Room (DB required by 2025 spec)
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    // DataStore (preferences, e.g., locale/currency)
    implementation("androidx.datastore:datastore-preferences:1.1.1")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
}