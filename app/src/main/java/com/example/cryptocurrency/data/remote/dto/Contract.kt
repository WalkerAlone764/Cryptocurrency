package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Contract(
    val contract: String,
    val platform: String,
    val type: String
)