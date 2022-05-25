package com.example.movies_app.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiRepository: ApiService) {

    suspend fun getAllMovies() = apiRepository.getAllMovies()

}