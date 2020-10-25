object Versions {
    // kotlin
    const val kotlin = "1.3.10"
    const val androidX = "1.3.2"
    const val appCompat = "1.2.0"
    const val material = "1.2.1"
    const val constraintLayout = "2.0.2"
    const val retrofit = "2.9.0"
    const val gson = "2.8.6"
}

object Libs {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val androidX = "androidx.core:core-ktx:${Versions.androidX}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val materialDesign = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"


    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

}