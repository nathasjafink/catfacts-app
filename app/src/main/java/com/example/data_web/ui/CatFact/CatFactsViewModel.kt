package com.example.data_web.ui.CatFact

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data_web.DTO.CatFact
import com.example.data_web.data.CatFactsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CatFactsViewModel : ViewModel() {
    private val catFactsRepository = CatFactsRepository();
    var currentCatFactString: String by mutableStateOf("Press the button to get a cat fact!")
        private set;

    fun getRandomFact() {
        viewModelScope.launch {
            try {
                val data = withContext(Dispatchers.IO) {
                    currentCatFactString = catFactsRepository.getCatFact().fact
                }
            } catch (e: Exception) {
                currentCatFactString = e.message.toString()
            }
        }
    }
}