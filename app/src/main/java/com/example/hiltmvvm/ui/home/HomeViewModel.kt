package com.example.hiltmvvm.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltmvvm.data.Result
import com.example.hiltmvvm.data.local.LocalData
import com.example.hiltmvvm.data.models.MemberList
import com.example.hiltmvvm.data.repositories.MemberRepository
import kotlinx.coroutines.launch

class HomeViewModel @ViewModelInject constructor(
        private val memberRepository: MemberRepository
) : ViewModel() {

    private val _membersList = MutableLiveData<Result<MemberList>>()
    val memberList: LiveData<Result<MemberList>> = _membersList

    fun loadData() {
        viewModelScope.launch {
            _membersList.value = Result.Loading()
            _membersList.value = memberRepository.getMembers()
        }
    }
}