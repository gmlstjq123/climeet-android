package com.climus.climeet.presentation.util

object Constants {

    const val TAG = "debugging"
    const val X_ACCESS_TOKEN = "X-ACCESS_TOKEN"
    const val X_REFRESH_TOKEN = "X_REFRESH_TOKEN"

    const val KAKAO = "KAKAO"
    const val NAVER = "NAVER"

    const val TEST_IMG = "data:image/png;base64,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"

}