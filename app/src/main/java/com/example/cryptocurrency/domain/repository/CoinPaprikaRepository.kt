package com.example.cryptocurrency.domain.repository

import com.example.cryptocurrency.data.remote.dto.Coin
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.data.remote.dto.CryptoCurrency

interface CoinPaprikaRepository {

    suspend fun getAllCryptoCurrency(): List<Coin>

    suspend fun getCryptoByCoinId(coinId: String): CoinDetail

}