package com.example.hiltmvvm.data.remote

import com.example.hiltmvvm.data.Result
import com.example.hiltmvvm.data.models.Member
import com.example.hiltmvvm.data.models.MemberList
import com.example.hiltmvvm.data.remote.services.MemberServices
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class RemoteData @Inject constructor(private val client: APIClient) : RemoteDataSource {

    override suspend fun getMembers(): Result<MemberList> {
        val membersService = client.getService(MemberServices::class.java)
        return when (val response = process(membersService::getMembers)) {
            is List<*> -> {
                Result.Success(data = MemberList(response as List<Member>))
            }
            else -> {
                Result.DataError(errorCode = response as Int)
            }
        }
    }

    private suspend fun process(call: suspend () -> Response<*>): Any? {
        // TODO check connectivity and return network error

        return try {
            val response = call.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                response.body()
            } else {
                responseCode
            }
        } catch (e: IOException) {
            //TODO network error
        }
    }
}