package com.dicoding.animecompose.ui.screen.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.animecompose.data.AnimeRepository
import com.dicoding.animecompose.model.Anime
import com.dicoding.animecompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: AnimeRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Anime>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Anime>>>
        get() = _uiState

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun search(newQuery: String) = viewModelScope.launch {
        _query.value = newQuery
        repository.searchAnime(_query.value)
            .catch {
                _uiState.value = UiState.Error(it.message.toString())
            }
            .collect {
                _uiState.value = UiState.Success(it)
            }
    }

    fun updateAnime(id: Int, newState: Boolean) = viewModelScope.launch {
        repository.updateAnime(id, newState)
            .collect { isUpdated ->
                if (isUpdated) search(_query.value)
            }
    }
}