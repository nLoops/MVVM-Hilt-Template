package com.example.hiltmvvm.di

import android.content.Context
import android.media.MediaDataSource
import com.example.hiltmvvm.data.local.LocalData
import com.example.hiltmvvm.data.local.LocalDataSource
import com.example.hiltmvvm.data.local.db.AppDatabase
import com.example.hiltmvvm.data.remote.APIClient
import com.example.hiltmvvm.data.remote.RemoteData
import com.example.hiltmvvm.data.remote.RemoteDataSource
import com.example.hiltmvvm.data.repositories.MemberRepository
import com.example.hiltmvvm.data.repositories.MemberRepositorySource
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

    @Singleton
    @Provides
    fun provideMemberRepository(
            localData: LocalData,
            remoteData: RemoteData
    ): MemberRepositorySource = MemberRepository(localData, remoteData)


    // TODO provide [Coroutines.Dispatchers] to be shared across the global and used by [WorkManager]
    // TODO provide [Analytical Delegator] to record all app actions
    // TODO provide [PrefStorage] for app theming [Light, Dark] and the user settings
}