package com.example.hiltmvvm.data.local.converters

import androidx.room.TypeConverter
import com.example.hiltmvvm.data.models.Member
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MemberTypeConverter {

    @TypeConverter
    fun fromEntity(member: Member): String {
        val gson = Gson()
        val type = object : TypeToken<Member>() {}.type
        return gson.toJson(member, type)
    }

    @TypeConverter
    fun toEntity(value: String): Member {
        val gson = Gson()
        val type = object : TypeToken<Member>() {}.type
        return gson.fromJson(value, type)
    }
}