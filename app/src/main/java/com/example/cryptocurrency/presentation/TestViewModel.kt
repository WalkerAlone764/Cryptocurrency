package com.example.cryptocurrency.presentation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptocurrency.data.remote.dto.CoinDetail
import com.example.cryptocurrency.domain.use_case.GetCurrencyListUseCase
import com.example.cryptocurrency.util.Resources
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val getCurrencyListUseCase: GetCurrencyListUseCase
): ViewModel() {

    var coinList by mutableStateOf<List<CoinDetail>>(emptyList())
        private set

    init {
        viewModelScope.launch {
            getCurrencyListUseCase.invoke().collect {result ->
                    when(result) {
                        is Resources.Error -> {
                            Log.d("error", result.message.toString())
                        }
                        is Resources.Loading -> {
                            Log.d("loading","loading")
                        }
                        is Resources.Success -> {
                            Log.d("size", result.data?.size.toString())
                        }
                    }
            }
        }
    }

}