package com.example.hiltmvvm.data.local

import androidx.lifecycle.LiveData
import com.example.hiltmvvm.data.models.Member
import com.example.hiltmvvm.data.models.MemberList

interface LocalDataSource {
    suspend fun getAllMembers(): MemberList
}