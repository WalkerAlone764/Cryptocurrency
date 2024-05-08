package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    val explorer: List<String> = emptyList(),
    val facebook: List<String> = emptyList(),
    val medium: List<String> = emptyList(),
    val reddit: List<String> = emptyList(),
    @SerialName("source_code")
    val sourceCode: List<String> = emptyList(),
    val website: List<String> = emptyList(),
    val youtube: List<String> = emptyList()
)