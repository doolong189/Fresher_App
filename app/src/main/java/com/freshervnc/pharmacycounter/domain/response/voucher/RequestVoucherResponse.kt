package com.freshervnc.pharmacycounter.domain.response.voucher

import com.google.gson.annotations.SerializedName

data class RequestVoucherResponse (
    @SerializedName("data_id")
    val data_id : List<Int>
)