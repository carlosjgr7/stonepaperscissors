package com.example.stonepaperscissors.game.domain

import com.example.stonepaperscissors.game.ui.model.OnWin
import javax.inject.Inject

class CheckResultGame @Inject constructor(val getMachineSelected: GetMachineSelected) {
    operator fun invoke(selected: OnWin): String {

        val pcSelected = getMachineSelected()

        if (selected.GetItemsGame() == pcSelected) {
            return "Empate el rival saco ${pcSelected.name}"
        }
        val win = selected.onwin(pcSelected)

        if (win) {
            return "Ganaste la partida el rival saco ${pcSelected.name}"
        } else {
            return "Perdiste la partida el rival saco ${pcSelected.name}"


        }
    }
}



