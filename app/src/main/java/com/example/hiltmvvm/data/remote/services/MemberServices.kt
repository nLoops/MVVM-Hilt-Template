package com.example.hiltmvvm.data.remote.services

import com.example.hiltmvvm.data.models.Member
import retrofit2.http.GET

interface MemberServices {
    @GET("/webpack/members/organizations.json")
    suspend fun getMembers():List<Member>

}