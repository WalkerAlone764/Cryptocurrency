package com.example.cryptocurrency.data.repository

import com.example.cryptocurrency.data.remote.SimpleSwapApi
import com.example.cryptocurrency.data.remote.dto.CryptoCurrency
import com.example.cryptocurrency.domain.repository.SimpleSwapRepository

class SimpleSwapRepositoryImpl(
    private val api: SimpleSwapApi
): SimpleSwapRepository {
    override suspend fun getAllCryptoCurrency(): List<CryptoCurrency> {
        TODO("Not yet implemented")
    }

    override suspend fun getCryptoBySymbol(symbol: String): CryptoCurrency {
        TODO("Not yet implemented")
    }
}