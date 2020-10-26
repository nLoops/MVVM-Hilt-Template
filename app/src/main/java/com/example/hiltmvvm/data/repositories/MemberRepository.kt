package com.example.hiltmvvm.data.repositories

import com.example.hiltmvvm.data.Result
import com.example.hiltmvvm.data.local.LocalData
import com.example.hiltmvvm.data.models.MemberList
import com.example.hiltmvvm.data.remote.RemoteData
import javax.inject.Inject


class MemberRepository @Inject constructor(
        private val localData: LocalData,
        private val remoteData: RemoteData
) : MemberRepositorySource {

    override suspend fun getMembers(): Result<MemberList> {
        return remoteData.getMembers()
    }


}