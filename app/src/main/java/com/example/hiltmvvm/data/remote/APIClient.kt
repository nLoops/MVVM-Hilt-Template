package com.example.hiltmvvm.data.remote

import com.example.hiltmvvm.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val READ_TIME_OUT = 30
private const val CONNECT_TIME_OUT = 30
private const val CONTENT_TYPE = "Content-Type"
private const val CONTENT_TYPE_VALUE = "application/json"
private const val BASE_URL = "https://opencollective.com"

class APIClient {

    private val okHttpBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
    private val retrofit: Retrofit

    private val logger: HttpLoggingInterceptor
        get() {
            val loggingInterceptor = HttpLoggingInterceptor()
            if (BuildConfig.DEBUG) {
                loggingInterceptor.apply { level = HttpLoggingInterceptor.Level.BODY }
            }
            return loggingInterceptor
        }

    init {
        okHttpBuilder.addInterceptor(logger)
        okHttpBuilder.connectTimeout(CONNECT_TIME_OUT.toLong(), TimeUnit.SECONDS)
        okHttpBuilder.readTimeout(READ_TIME_OUT.toLong(), TimeUnit.SECONDS)
        val client = okHttpBuilder.build()

        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun <S> getService(service: Class<S>): S {
        return retrofit.create(service)
    }

}