package com.example.hiltmvvm.di

import android.content.Context
import com.example.hiltmvvm.data.local.LocalData
import com.example.hiltmvvm.data.local.LocalDataSource
import com.example.hiltmvvm.data.local.db.AppDatabase
import com.example.hiltmvvm.data.remote.APIClient
import com.example.hiltmvvm.data.remote.RemoteData
import com.example.hiltmvvm.data.remote.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

// If we need only inject in the activity scope use below
// @InstallIn(ActivityComponent::class)
//
// instead of we need the dependencies available on the app scope
// use below

@InstallIn(ApplicationComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApiClient(): APIClient = APIClient()

    @Singleton
    @Provides
    fun provideRemoteDataSource(apiClient: APIClient): RemoteDataSource = RemoteData(apiClient)

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    @Singleton
    @Provides
    fun provideLocalDataSource(database: AppDatabase): LocalDataSource = LocalData(database)
}