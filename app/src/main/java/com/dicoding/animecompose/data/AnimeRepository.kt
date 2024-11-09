package com.dicoding.animecompose.data

import com.dicoding.animecompose.model.Anime
import com.dicoding.animecompose.model.AnimeData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

class AnimeRepository {
    private val animeList = mutableListOf<Anime>()

    init {
        if (animeList.isEmpty()) {
            AnimeData.animeDummy.forEach {
                animeList.add(it)
            }
        }
    }

    fun getAnimeById(animeId: Int): Anime {
        return animeList.first {
            it.id == animeId
        }
    }

    fun getFavoriteAnime(): Flow<List<Anime>> {
        return flowOf(animeList.filter { it.isFavorite })
    }

    fun searchAnime(query: String) = flow {
        val data = animeList.filter {
            it.title.contains(query, ignoreCase = true)
        }
        emit(data)
    }

    fun updateAnime(animeId: Int, newState: Boolean): Flow<Boolean> {
        val index = animeList.indexOfFirst { it.id == animeId }
        val result = if (index >= 0) {
            val anime = animeList[index]
            animeList[index] = anime.copy(isFavorite = newState)
            true
        } else {
            false
        }
        return flowOf(result)
    }

    companion object {
        @Volatile
        private var instance: AnimeRepository? = null

        fun getInstance(): AnimeRepository =
            instance ?: synchronized(this) {
                AnimeRepository().apply {
                    instance = this
                }
            }
    }
}