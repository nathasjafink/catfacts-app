package com.example.data_web.ui.CatFact

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun SingleCatFact(){
    val viewModel = viewModel<CatFactsViewModel>()

    Box {
        Column(
            Modifier.padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Press next to get a cat fact!")
            Spacer(modifier = Modifier.height(70.dp))
            Text(text = viewModel.currentCatFactString)
            Spacer(modifier = Modifier.height(70.dp))
            Row {
                Button(onClick = {}) {
                    Text("Like")
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { viewModel.getRandomFact() }) {
                    Text("Next")
                }
            }

        }
    }
}