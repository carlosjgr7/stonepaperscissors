package com.example.stonepaperscissors.game.ui.data

sealed class ItemsGame(
    val name: HandType,
    val listofCanWin: List<HandType>
) {
    object Scissors : ItemsGame(
        name = HandType.Scissors,
        listofCanWin = listOf(HandType.Paper)
    )
    object Paper : ItemsGame(
        name = HandType.Paper,
        listofCanWin = listOf(HandType.Stone)
    )
    object Stone : ItemsGame(
        name = HandType.Stone,
        listofCanWin = listOf(HandType.Scissors)
    )
}
