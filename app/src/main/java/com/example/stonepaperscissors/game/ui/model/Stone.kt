package com.example.stonepaperscissors.game.ui.model

import androidx.compose.ui.text.toLowerCase
import com.example.stonepaperscissors.game.data.ItemsGame
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Stone @Inject constructor() : OnWin {

    val itemsGame: ItemsGame = ItemsGame.Stone

    override fun onwin(selected: ItemsGame): Boolean {
        val listOfCanWin = listOf<ItemsGame>(ItemsGame.Scissors)
        return listOfCanWin.contains(selected)
    }

    override fun GetItemsGame(): ItemsGame {
        return itemsGame
    }
}