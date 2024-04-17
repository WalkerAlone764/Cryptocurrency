package com.example.cryptocurrency.domain.repository

import com.example.cryptocurrency.data.remote.dto.CryptoCurrency

interface SimpleSwapRepository {

    suspend fun getAllCryptoCurrency(): List<CryptoCurrency>

    suspend fun getCryptoBySymbol(symbol: String): CryptoCurrency

}