package com.example.data_web.ui.CatFact

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
            Text(text = viewModel.currentCatFactString)
            Button(onClick = { viewModel.getRandomFact() }) {
                Text("Fetch a fact")
            }
        }
    }
}