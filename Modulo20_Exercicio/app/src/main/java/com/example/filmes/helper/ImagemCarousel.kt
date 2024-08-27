package com.example.filmes.helper

import com.example.filmes.api.FilmesService
import com.example.filmes.data.ApiCredentials
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

object ImagemCarousel {
    suspend fun getCarouselImages(id: Int, filmesService: FilmesService): List<CarouselItem> {
        val apiKey = ApiCredentials.API_KEY
        val response = filmesService.getMovieImages(id, apiKey)

        if (response.isSuccessful) {
            val imagesResponse = response.body()
            val backdropImages = imagesResponse?.backdrops?.take(10)?.mapNotNull { backdrop ->
                val imageUrl = "https://image.tmdb.org/t/p/w500${backdrop.filePath}"
                CarouselItem(imageUrl = imageUrl)
            }
            return backdropImages ?: emptyList()
        }
        return emptyList()
    }

}