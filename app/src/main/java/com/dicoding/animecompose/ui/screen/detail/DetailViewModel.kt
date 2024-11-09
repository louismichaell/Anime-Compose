package com.dicoding.animecompose.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.animecompose.data.AnimeRepository
import com.dicoding.animecompose.model.Anime
import com.dicoding.animecompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: AnimeRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<Anime>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Anime>>
        get() = _uiState

    fun getAnimeById(id: Int) = viewModelScope.launch {
        _uiState.value = UiState.Loading
        _uiState.value = UiState.Success(repository.getAnimeById(id))
    }


    fun updateAnime(id: Int, newState: Boolean) = viewModelScope.launch {
        repository.updateAnime(id, !newState)
            .collect { isUpdated ->
                if (isUpdated) getAnimeById(id)
            }
    }

}