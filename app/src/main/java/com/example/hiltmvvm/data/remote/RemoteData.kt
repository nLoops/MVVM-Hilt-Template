package com.example.hiltmvvm.data.remote

import com.example.hiltmvvm.data.models.MemberList
import com.example.hiltmvvm.data.remote.services.MemberServices

class RemoteData : RemoteDataSource {
    private val client = APIClient()

    override suspend fun getMembers(): MemberList {
        val membersService = client.getService(MemberServices::class.java)
        val response = membersService.getMembers()
        return MemberList(response)
    }
}