package com.example.hiltmvvm.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class MemberList(val data: List<Member>)

@Entity(tableName = "members")
data class Member(
    @PrimaryKey
    @ColumnInfo(name = "member_id")
    val MemberId: Int,
    val company: String,
    val createdAt: String,
    val description: String,
    val email: String,
    val github: String,
    val image: String,
    val isActive: Boolean,
    val lastTransactionAmount: Double,
    val lastTransactionAt: String,
    val name: String,
    val profile: String,
    val role: String,
    val totalAmountDonated: Double,
    val twitter: String,
    val type: String,
    val website: String
)