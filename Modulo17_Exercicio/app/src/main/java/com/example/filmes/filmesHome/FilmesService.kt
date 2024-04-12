package com.example.filmes.filmesHome

import com.example.filmes.data.FilmesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FilmesService {

    @GET("https://api.themoviedb.org/3/movie/now_playing")
    fun getFilmesLista(
        @Query("id") id: String,
        @Query("title") title: String,
        @Query("overview") overview: String,
        @Query("popularity") popularity: Int,
        @Query("poster_path") poster_path: String
    ) : Call<FilmesResponse>

}