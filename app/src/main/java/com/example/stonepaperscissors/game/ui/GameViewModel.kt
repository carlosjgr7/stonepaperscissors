package com.example.stonepaperscissors.game.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.stonepaperscissors.game.data.ItemsGame
import com.example.stonepaperscissors.game.domain.CheckResultGame
import com.example.stonepaperscissors.game.domain.GetMachineSelected
import com.example.stonepaperscissors.game.ui.model.OnWin
import com.example.stonepaperscissors.game.ui.model.Paper
import com.example.stonepaperscissors.game.ui.model.Scissors
import com.example.stonepaperscissors.game.ui.model.Stone
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class GameViewModel @Inject constructor(
    private val checkResultGame: CheckResultGame,
    private val Paper: Paper,
    private val Stone: Stone,
    private val Scissors: Scissors

) : ViewModel() {

    private val _showResultGame = MutableLiveData<String>()
    val showResultGame: LiveData<String> = _showResultGame
/*
* la duda es que estoy llamando a un ItemsGame desde el view
* eso no rompe la inyeccion de deoendecia?
* */

    fun onItemSelected(itemGame: ItemsGame) {
        itemGame.let {
            when (it) {
                ItemsGame.Paper -> _showResultGame.value = checkResultGame(Paper)
                ItemsGame.Scissors -> _showResultGame.value = checkResultGame(Scissors)
                ItemsGame.Stone -> _showResultGame.value = checkResultGame(Stone)
            }
        }
    }
}







