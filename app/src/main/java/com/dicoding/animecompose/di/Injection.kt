package com.dicoding.animecompose.di

import com.dicoding.animecompose.data.AnimeRepository

object Injection {
    fun provideRepository(): AnimeRepository {
        return AnimeRepository.getInstance()
    }
}