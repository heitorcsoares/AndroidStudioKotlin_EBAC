package com.example.filmes.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FilmesImagesResponse(
    @Json(name = "id") val id: Int,
    @Json(name = "backdrops") val backdrops: List<Backdrop>
    )

@JsonClass(generateAdapter = true)
data class Backdrop(
    @Json(name = "file_path") val filePath: String
)