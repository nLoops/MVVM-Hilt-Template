package com.example.hiltmvvm.data.remote

import com.example.hiltmvvm.data.Result
import com.example.hiltmvvm.data.models.MemberList

// Remote data source contract
interface RemoteDataSource {
    suspend fun getMembers(): Result<MemberList>
}