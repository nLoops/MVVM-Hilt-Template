package com.example.hiltmvvm.data.local.dao

import androidx.room.*
import com.example.hiltmvvm.data.models.Member

@Dao
interface MembersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(member: Member)

    @Query("SELECT * FROM members")
    suspend fun getAll(): List<Member>

    @Delete
    suspend fun delete(member: Member)

    @Query("SELECT * FROM members where member_id = :id")
    suspend fun getMember(id: Int): Member
}