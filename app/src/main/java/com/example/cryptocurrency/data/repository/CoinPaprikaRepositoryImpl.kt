package com.example.cryptocurrency.data.repository

import com.example.cryptocurrency.data.remote.CoinPaprikaApi
import com.example.cryptocurrency.data.remote.dto.Coin
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.domain.repository.CoinPaprikaRepository
import javax.inject.Inject

class CoinPaprikaRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinPaprikaRepository {
    override suspend fun getAllCryptoCurrency(): List<Coin> {
       return api.getAllCryptoCurrency()
    }

    override suspend fun getCryptoByCoinId(coinId: String): CoinDetail {
        return api.getCryptoByCoinId(coinId = coinId)
    }
}