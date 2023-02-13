package com.example.stonepaperscissors.game.ui.model

import com.example.stonepaperscissors.game.data.ItemsGame
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Paper @Inject constructor()  : OnWin {

    val itemsGame: ItemsGame = ItemsGame.Paper

    override fun onwin(selected: ItemsGame):Boolean {
        val listOfCanWin = listOf<ItemsGame>(ItemsGame.Stone)
        return listOfCanWin.contains(selected)
    }

    override fun GetItemsGame(): ItemsGame {
        return itemsGame
    }


}