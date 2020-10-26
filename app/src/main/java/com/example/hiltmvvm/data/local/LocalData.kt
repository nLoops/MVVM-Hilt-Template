package com.example.hiltmvvm.data.local

import com.example.hiltmvvm.data.local.db.AppDatabase
import com.example.hiltmvvm.data.models.MemberList
import javax.inject.Inject

class LocalData @Inject constructor(private val database: AppDatabase) : LocalDataSource {

    override suspend fun getAllMembers(): MemberList =
        MemberList(database.memberDao().getAll())
}