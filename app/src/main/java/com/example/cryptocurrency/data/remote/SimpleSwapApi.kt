package com.example.cryptocurrency.data.remote

import com.example.cryptocurrency.data.remote.dto.CryptoCurrency
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleSwapApi {
    @GET("/get_all_currencies")
    suspend fun getAllCryptoCurrency(): List<CryptoCurrency>

    @GET("/get_currency?{symbol}")
    suspend fun getCryptoBySymbol(@Path("symbol") symbol: String): CryptoCurrency

}