package com.example.foodapp.ui.home

import androidx.lifecycle.ViewModel
import com.example.foodapp.data.Resource
import com.example.foodapp.data.home.HomeRepository
import com.example.foodapp.data.model.Meal
import javax.inject.Inject

class HomeViewModel@Inject constructor(private val loginRepository: HomeRepository) :
    ViewModel() {
    suspend fun getRandomMeal(): Resource<List<Meal>>{
        return loginRepository.getRandomMeal()
    }
}
