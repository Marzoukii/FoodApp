package com.example.foodapp.data.home

import com.example.foodapp.data.Resource
import com.example.foodapp.data.model.Meal
import com.example.foodapp.data.remote.FoodService
import javax.inject.Inject

class HomeRepository
    @Inject
    constructor(private val remoteService: FoodService) {
        suspend fun getRandomMeal(): Resource<List<Meal>> {
            try {
                val response = remoteService.getRandomMeal()
                if (response.isSuccessful && response.body() != null) {
                    return Resource.Success(response.body()!!)
                } else {
                    // Handle the error case here
                    val errorMessage = response.message() ?: "Unknown error"
                    return Resource.Error(errorMessage)
                }
            } catch (e: Exception) {
                // Handle exceptions here
                return Resource.Error(e.message)
            }
        }
    }
