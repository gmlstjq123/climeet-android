package com.climus.climeet.data.repository

import com.climus.climeet.data.model.BaseState
import com.climus.climeet.data.model.response.UploadImgResponse
import okhttp3.MultipartBody

interface MainRepository {
    suspend fun uploadImage(
        image: MultipartBody.Part
    ): BaseState<UploadImgResponse>
}