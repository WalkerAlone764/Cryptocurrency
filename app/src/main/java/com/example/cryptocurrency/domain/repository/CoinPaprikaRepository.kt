package com.example.cryptocurrency.domain.repository

import com.example.cryptocurrency.data.remote.dto.Coin
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.domain.model.CoinDomain

interface CoinPaprikaRepository {

    suspend fun getAllCryptoCurrency(): List<CoinDomain>

    suspend fun getCryptoByCoinId(coinId: String): CoinDetail

}