package com.example.hiltmvvm.data.repositories

import com.example.hiltmvvm.data.Result
import com.example.hiltmvvm.data.models.MemberList

interface MemberRepositorySource {
    suspend fun getMembers(): Result<MemberList>
}