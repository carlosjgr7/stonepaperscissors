package com.example.stonepaperscissors.game.ui.data

sealed class ItemsGame(
    val name: String,
    val listofCanWin: List<ItemsGame>
) {
    object Scissors : ItemsGame(
        "Tijeras",
        listOf(Paper)
    )
    object Paper : ItemsGame(
        "Papel",
        listOf(Stone)
    )

    object Stone : ItemsGame(
        "Piedra",
        listOf(Scissors)
    )
}
