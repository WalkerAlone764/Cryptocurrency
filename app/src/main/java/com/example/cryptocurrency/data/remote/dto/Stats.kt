package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Stats(
    val contributors: Int,
    val stars: Int,
    val subscribers: Int
)