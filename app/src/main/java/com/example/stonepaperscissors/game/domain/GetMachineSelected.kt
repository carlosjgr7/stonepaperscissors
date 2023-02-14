package com.example.stonepaperscissors.game.domain

import com.example.stonepaperscissors.game.ui.data.ItemsGame
import javax.inject.Inject
import kotlin.random.Random

class GetMachineSelected @Inject constructor() {
    operator fun invoke(): ItemsGame =
         when (Random.nextInt(from = 0, until = 3)) {
            0 -> ItemsGame.Stone
            1 -> ItemsGame.Paper
            else -> ItemsGame.Scissors
        }
    }
