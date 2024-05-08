package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Stats(
    val contributors: Int? = null,
    val stars: Int? = null,
    val subscribers: Int? = null
)