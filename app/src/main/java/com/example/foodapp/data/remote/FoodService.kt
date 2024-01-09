package com.example.foodapp.data.remote

import com.example.foodapp.data.model.Meal
import retrofit2.Response
import retrofit2.http.GET

interface FoodService {
    @GET("random.php")
    suspend fun getRandomMeal(): Response<List<Meal>>
}
