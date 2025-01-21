//package com.example.orange_ji.presentation.mainfollowing
//
//import android.util.Log
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
////import androidx.lifecycle.viewModelScope
//import com.example.orange_ji.utils.base.BaseResponse
////import com.example.orange_ji.domain.model.FollowingItemResponse
////import com.example.orange_ji.domain.usecase.FollowingItemInteractor
////import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.catch
//import kotlinx.coroutines.flow.flowOn
//import kotlinx.coroutines.launch
////import javax.inject.Inject
//
//@HiltViewModel
//class FollowingViewModel @Inject constructor(
//    val followingItemInteractor: FollowingItemInteractor
//) : ViewModel() {
//
//    private val _followingItemList: MutableLiveData<BaseResponse<FollowingItemResponse>> = MutableLiveData()
//    val followingItemList: LiveData<BaseResponse<FollowingItemResponse>> = _followingItemList
//    fun getFollowingItemList() = viewModelScope.launch {
//        followingItemInteractor.getFollowingItemList()
//            .flowOn(Dispatchers.IO)
//            .catch { e ->
//                Log.e("CashierHomeViewModel", e.toString())
//            }
//            .collect {
//                _followingItemList.value = it
//            }
//    }
//
//}