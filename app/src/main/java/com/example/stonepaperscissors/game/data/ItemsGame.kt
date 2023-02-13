package com.example.stonepaperscissors.game.data

import javax.inject.Inject

sealed class  ItemsGame(val name:String){
    object Stone:ItemsGame("Piedra")
    object Paper:ItemsGame("Papel")
    object Scissors:ItemsGame("Tijeras")
}
