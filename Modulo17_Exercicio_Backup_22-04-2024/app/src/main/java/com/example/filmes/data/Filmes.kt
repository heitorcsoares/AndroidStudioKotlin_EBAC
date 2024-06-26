package com.example.filmes.data

import com.example.filmes.api.ApiCredentials
import com.squareup.moshi.JsonClass

/** Classe responsavel saber o status da Request (solicitação) */
@JsonClass(generateAdapter = true)
class Filmes (
    val id: Int?,
    val title: String?,
    val overview: String?,
    val popularity: Int?,
    val poster_path: String
){

    /** Verifica se há conteudo na Descrição do Filme */
    fun getOverview(): String{
        return when{
            overview?.isNotEmpty() == true -> overview ?: "Conteudo não disponivel."
            else -> "Conteudo não disponivel."
        }
    }

    /** Caminho para Imagem de Capa */
    fun getFullImagePath(): String {
        val pathHttps = ApiCredentials.BASE_URL
        val pathImagem = "/images"

        return "$pathHttps.$poster_path.$pathImagem"
    }
}


/** https://api.themoviedb.org/3/movie/{movie_id}/images */