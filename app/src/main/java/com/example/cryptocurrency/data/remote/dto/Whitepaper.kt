package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Whitepaper(
    val link: String,
    val thumbnail: String
)