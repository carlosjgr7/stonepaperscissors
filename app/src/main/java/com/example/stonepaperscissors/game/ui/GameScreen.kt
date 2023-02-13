package com.example.stonepaperscissors.game.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.stonepaperscissors.game.data.ItemsGame

@Composable
fun GameScreen(gameViewModel: GameViewModel) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val resultGame:String by gameViewModel.showResultGame.observeAsState(initial = "selecciona una opcion")


        val (btnStone, txtresult, btnPaper, btnScissors) = createRefs()

        Text(modifier = Modifier.constrainAs(txtresult) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
        }.padding(top = 12.dp), text = resultGame)

        Button(modifier = Modifier.constrainAs(btnStone) {
            top.linkTo(txtresult.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(btnPaper.start)
        }, onClick = { gameViewModel.onItemSelected(ItemsGame.Stone) }) {
            Text(text = "piedra")
        }

        Button(modifier = Modifier.constrainAs(btnPaper) {
            top.linkTo(txtresult.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(btnStone.end)
            end.linkTo(btnScissors.start)
        }, onClick = { gameViewModel.onItemSelected(ItemsGame.Paper) }) {
            Text(text = "papel")
        }

        Button(modifier = Modifier.constrainAs(btnScissors) {
            top.linkTo(txtresult.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(btnPaper.end)
            end.linkTo(parent.end)
        }, onClick = { gameViewModel.onItemSelected(ItemsGame.Scissors) }) {
            Text(text = "tijera")
        }


    }
}