package com.example.stonepaperscissors.game.domain

import com.example.stonepaperscissors.game.data.ItemsGame
import javax.inject.Inject
import kotlin.random.Random

class GetMachineSelected @Inject constructor() {
    operator fun invoke():ItemsGame =
         when (Random.nextInt(from = 0, until = 3)) {
            0 -> ItemsGame.Stone
            1 -> ItemsGame.Paper
            2 -> ItemsGame.Scissors
            else -> ItemsGame.Stone //nunca lo va a tomar porque el ramdon no lo permite
        }
    }
