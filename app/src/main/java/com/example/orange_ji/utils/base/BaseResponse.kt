package com.example.orange_ji.utils.base

sealed class BaseResponse<out T : Any> {
    data class Success<out T : Any>(val data: T) : BaseResponse<T>()
    data class Error(val message: String) : BaseResponse<Nothing>()
    object Loading : BaseResponse<Nothing>()
}
