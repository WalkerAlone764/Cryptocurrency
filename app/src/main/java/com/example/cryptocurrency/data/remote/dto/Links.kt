package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    val explorer: List<String>,
    val facebook: List<String>,
    val medium: String?,
    val reddit: List<String>,
    @SerialName("source_code")
    val sourceCode: List<String>,
    val website: List<String>,
    val youtube: List<String>
)