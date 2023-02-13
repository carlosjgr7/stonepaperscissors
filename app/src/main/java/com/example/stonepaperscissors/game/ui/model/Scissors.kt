package com.example.stonepaperscissors.game.ui.model

import com.example.stonepaperscissors.game.data.ItemsGame
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Scissors @Inject constructor() : OnWin {

    val itemsGame: ItemsGame = ItemsGame.Scissors

    override fun onwin(selected: ItemsGame): Boolean {
        val listOfCanWin = listOf<ItemsGame>(ItemsGame.Paper)
        return listOfCanWin.contains(selected)
    }

    override fun GetItemsGame(): ItemsGame {
        return itemsGame
    }
}