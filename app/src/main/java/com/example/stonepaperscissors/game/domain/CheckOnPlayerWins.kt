package com.example.stonepaperscissors.game.domain

import android.util.Log
import com.example.stonepaperscissors.game.ui.data.GameStatus
import com.example.stonepaperscissors.game.ui.data.ItemsGame
import javax.inject.Inject

class CheckOnPlayerWins @Inject constructor() {
    operator fun invoke(player1: ItemsGame, player2: ItemsGame): String {
        return when (
            resolvergame(player1, player2)
        ) {
            GameStatus.Looser -> "Perdiste la partida el rival saco ${player2.name}"
            GameStatus.Winner -> "Ganaste la partida el rival saco ${player2.name}"
            GameStatus.Tie -> "Empate"
        }
    }

    private fun resolvergame(player1: ItemsGame, player2: ItemsGame): GameStatus {
        Log.i("Contenedor", player1.listofCanWin.toList().toString())
        Log.i("Contenedor", player1.name)

        if (player1 == player2) return GameStatus.Tie
        if (player1.listofCanWin.contains(player2)) return GameStatus.Winner
        return GameStatus.Looser
    }
}
