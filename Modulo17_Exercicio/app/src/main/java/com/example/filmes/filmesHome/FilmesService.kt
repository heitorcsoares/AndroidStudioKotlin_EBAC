package com.example.filmes.filmesHome

import com.example.filmes.data.FilmesLatest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FilmesService {

    @GET("movie/latest")
    fun getFilmesLista(
        @Query("id") id: Int,
        @Query("title") title: String,
        @Query("overview") overview: String,
        @Query("popularity") popularity: Int,
        @Query("release_date") release_date: String
    ) : Call<FilmesLatest>

}