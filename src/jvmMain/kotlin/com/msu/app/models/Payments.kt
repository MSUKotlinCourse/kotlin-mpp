package com.msu.app.models

import kotlinx.serialization.Serializable

@Serializable
data class Payment(val cardNo: String, val amount: Int)