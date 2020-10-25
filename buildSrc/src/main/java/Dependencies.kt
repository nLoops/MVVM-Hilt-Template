object Versions {
    // kotlin
    const val kotlin = "1.3.10"
    const val androidX = "1.3.2"
    const val appCompat = "1.2.0"
    const val material = "1.2.1"
    const val constraintLayout = "2.0.2"
    const val retrofit = "2.9.0"
    const val gson = "2.8.6"
    const val okhttp = "4.8.1"
    const val coroutineCore = "1.3.4"
    const val coroutineCommon = "1.3.7"
    const val lifeCycle = "2.2.0"
    const val lifeCycleKTX = "2.3.0-alpha04"

}

object Libs {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val androidX = "androidx.core:core-ktx:${Versions.androidX}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val materialDesign = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"


    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okhttp = "com.squareup.okhttp3:okhttps:${Versions.okhttp}"

    // Coroutines
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCore}"
    const val coroutinesCommon =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutineCommon}"
    const val coroutinesLifeCycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycle}"
    const val coroutinesViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleKTX}"
    const val coroutinesLiveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycleKTX}"

}