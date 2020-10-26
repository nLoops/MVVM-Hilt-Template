object Versions {
    // kotlin
    const val KOTLIN = "1.3.10"
    const val ANDROIDX = "1.3.2"
    const val APP_COMPAT = "1.2.0"
    const val MATERIAL = "1.2.1"
    const val CONSTRAINT_LAYOUT = "2.0.2"
    const val RETROFIT = "2.9.0"
    const val GSON = "2.8.6"
    const val OKHTTP = "4.8.1"
    const val OKHTTP_INTERCEPTOR = "4.8.1"
    const val COROUTINES_CORE = "1.3.4"
    const val COROUTINES_COMMON = "1.3.7"
    const val LIFECYCLE = "2.2.0"
    const val LIFECYCLE_KTX = "2.3.0-alpha04"
    const val HILT = "2.28-alpha"
    const val HILT_VIEWMODEL = "1.0.0-alpha01"
    const val ROOM = "2.2.5"
    const val FRAGMENT_KTX = "1.2.5"

}

object Libs {
    const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    const val ANDROIDX = "androidx.core:core-ktx:${Versions.ANDROIDX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val MATERIAL_DESIGN = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"


    // Retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
    const val INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP_INTERCEPTOR}"
    const val OKHTTP = "com.squareup.okhttp3:okhttps:${Versions.OKHTTP}"

    // Coroutines
    const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES_CORE}"
    const val COROUTINES_COMMON =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.COROUTINES_COMMON}"
    const val COROUTINES_LIFECYCLE = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val COROUTINES_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val COROUTINES_LIVEDATA =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}"

    // Dagger Hilt
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.HILT_VIEWMODEL}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_TESTING = "com.google.dagger:hilt-android-testing:${Versions.HILT}"
    const val HILT_COMPILER_X = "androidx.hilt:hilt-compiler:${Versions.HILT_VIEWMODEL}"

    // Room
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"

    // KTX
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx: ${Versions.FRAGMENT_KTX}"
    const val FRAGMENT = "androidx.fragment:fragment:${Versions.FRAGMENT_KTX}"

    // LIFECYCLE
    const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler: ${Versions.LIFECYCLE}"


}