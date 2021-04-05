package com.charlesadam.virtualphone

import java.lang.Exception

sealed class ResultResponse {
    data class Success<T> (val data:T) : ResultResponse()
    data class Error(val exception: Exception) : ResultResponse()
}