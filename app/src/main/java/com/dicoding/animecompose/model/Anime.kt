package com.dicoding.animecompose.model

data class Anime(
    val id: Int,
    val title: String,
    val synopsis: String,
    val image: Int,
    val episodes: String,
    val studio: String,
    val rating: Double,
    val genre: String,
    var isFavorite: Boolean = false
)