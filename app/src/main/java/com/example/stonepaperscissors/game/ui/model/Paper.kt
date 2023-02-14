package com.example.stonepaperscissors.game.ui.model

import com.example.stonepaperscissors.game.ui.data.ItemsGame
import com.example.stonepaperscissors.game.ui.data.OnWin
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Paper @Inject constructor(): OnWin {
    val itemsGame = ItemsGame.Paper
    override fun GetItemsGame(): ItemsGame {
        return itemsGame
    }


}