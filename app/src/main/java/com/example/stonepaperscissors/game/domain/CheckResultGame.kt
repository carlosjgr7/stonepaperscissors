package com.example.stonepaperscissors.game.domain

import com.example.stonepaperscissors.game.ui.data.ItemsGame
import javax.inject.Inject

class CheckResultGame @Inject constructor(
    val getMachineSelected: GetMachineSelected,
    val checkOnWins: CheckOnPlayerWins
) {
    operator fun invoke(selected: ItemsGame): String {
        return (checkOnWins(
            selected,
            getMachineSelected()
        ))
    }

}



