package com.example.cryptocurrency.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDetail(
    val contract: String? = null,
    val contracts: List<Contract> = emptyList(),
    val description: String,
    @SerialName("development_status")
    val developmentStatus: String? = null,
    @SerialName("first_data_at")
    val firstDataAt: String,
    @SerialName("hardware_wallet")
    val hardwareWallet: Boolean,
    @SerialName("hash_algorithm")
    val hashAlgorithm: String? = null,
    val id: String,
    @SerialName("is_active")
    val isActive: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    @SerialName("last_data_at")
    val lastDataAt: String,
    val links: Links,
    @SerialName("links_extended")
    val linksExtended: List<LinksExtended>,
    val logo: String,
    val message: String?= null,
    val name: String,
    @SerialName("open_source")
    val openSource: Boolean,
    @SerialName("org_structure")
    val orgStructure: String? = null,
    val parent: Parent? = null,
    val platform: String? = null,
    @SerialName("proof_type")
    val proofType: String? = null,
    val rank: Int,
    @SerialName("started_at")
    val startedAt: String? = null,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<Team>,
    val type: String,
    val whitepaper: Whitepaper
)