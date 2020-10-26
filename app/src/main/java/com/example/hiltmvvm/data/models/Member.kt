package com.example.hiltmvvm.data.models

data class MemberList(val data : List<Member>)

data class Member(
    val MemberId: Int,
    val company: Any,
    val createdAt: String,
    val description: String,
    val email: Any,
    val github: Any,
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