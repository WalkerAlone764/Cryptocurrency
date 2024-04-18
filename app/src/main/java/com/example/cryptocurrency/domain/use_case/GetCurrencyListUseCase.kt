package com.example.cryptocurrency.domain.use_case

import com.example.cryptocurrency.data.remote.dto.CryptoCurrency
import com.example.cryptocurrency.domain.repository.SimpleSwapRepository
import com.example.cryptocurrency.util.Resources
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCurrencyListUseCase @Inject constructor(
    private val repository: SimpleSwapRepository
) {
    operator fun invoke(): Flow<Resources<List<CryptoCurrency>>> {
        return flow {
            try {
                emit(Resources.Loading())
                val currencyList = repository.getAllCryptoCurrency()
                emit(Resources.Success(currencyList))
            } catch (e:HttpException) {
                emit(
                    Resources.Error(e.localizedMessage ?: "An unexpected error" )
                )
            } catch (e:IOException) {
                emit(
                    Resources.Error("Something went wrong, please try again later")
                )
            }
        }
    }

}