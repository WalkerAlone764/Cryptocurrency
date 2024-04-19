package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Parent(
    val id: String,
    val name: String,
    val symbol: String
)