package com.example.cryptocurrency.data.remote

import com.example.cryptocurrency.data.remote.dto.Coin
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.data.remote.dto.CryptoCurrency
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getAllCryptoCurrency(): List<Coin>
    @GET("/v1/coins/{coin_id}")
    suspend fun getCryptoByCoinId(@Path("coin_id") coinId: String): CoinDetail
}