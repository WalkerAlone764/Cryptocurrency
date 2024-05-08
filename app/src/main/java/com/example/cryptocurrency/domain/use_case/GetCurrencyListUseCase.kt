package com.example.cryptocurrency.domain.use_case

import android.util.Log
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.data.remote.dto.CryptoCurrency
import com.example.cryptocurrency.domain.repository.CoinPaprikaRepository
import com.example.cryptocurrency.domain.repository.SimpleSwapRepository
import com.example.cryptocurrency.util.Resources
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCurrencyListUseCase @Inject constructor(
    private val repository: CoinPaprikaRepository
) {
    operator fun invoke(): Flow<Resources<List<CoinDetail>>> {
        return flow {
            try {
                val mylist = mutableListOf<CoinDetail>()

                emit(Resources.Loading())
                val currencyList = repository.getAllCryptoCurrency()
                Log.d("curr", currencyList.size.toString())
//                currencyList.take(currencyList.size/2).forEach { coin ->
//                    val data = repository.getCryptoByCoinId(coin.id)
//                    Log.d("data", data.toString())
//                    mylist.add(data)
//                }
                emit(Resources.Success(mylist))
            } catch (e: HttpException) {
                emit(
                    Resources.Error(e.localizedMessage ?: "An unexpected error")
                )
            } catch (e: IOException) {
                emit(
                    Resources.Error("Something went wrong, please try again later")
                )
            }
        }
    }

}