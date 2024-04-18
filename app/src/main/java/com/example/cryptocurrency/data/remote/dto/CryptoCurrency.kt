package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoCurrency(
    @SerialName("address_explorer")
    val addressExplorer: String?,
    @SerialName("confirmations_from")
    val confirmationsFrom: String?,
    @SerialName("contract_address")
    val contractAddress: String?,
    @SerialName("extra_id")
    val extraId: String,
    @SerialName("has_extra_id")
    val hasExtraId: Boolean,
    val image: String,
    val isFiat: Boolean,
    val name: String,
    val network: String?,
    val symbol: String,
    @SerialName("tx_explorer")
    val txExplorer: String?,
    @SerialName("validation_address")
    val validationAddress: String?,
    @SerialName("validation_extra")
    val validationExtra: String?,
    @SerialName("warnings_from")
    val warningsFrom: List<String?> = emptyList(),
    @SerialName("warnings_to")
    val warningsTo: List<String?> = emptyList()
)