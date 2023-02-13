package com.example.stonepaperscissors.game.ui.model

import com.example.stonepaperscissors.game.data.ItemsGame

interface OnWin {
    fun onwin(selected: ItemsGame):Boolean
    fun GetItemsGame():ItemsGame

}