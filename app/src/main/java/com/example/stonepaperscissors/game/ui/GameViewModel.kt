package com.example.stonepaperscissors.game.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.stonepaperscissors.game.ui.data.ItemsGame
import com.example.stonepaperscissors.game.domain.CheckResultGame
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class GameViewModel @Inject constructor(
    private val checkResultGame: CheckResultGame,
) : ViewModel() {
    private val _showResultGame = MutableLiveData<String>()
    val showResultGame: LiveData<String> = _showResultGame
    fun onItemSelected(itemGame: ItemsGame) {
        _showResultGame.value = checkResultGame(itemGame)
    }
}







