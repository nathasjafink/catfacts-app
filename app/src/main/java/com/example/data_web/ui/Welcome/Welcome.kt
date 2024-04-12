package com.example.data_web.ui.Welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.data_web.Greeting
import com.example.data_web.ui.theme.DatawebTheme
import androidx.navigation.NavController

@Composable
fun Welcome (navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Welcome to the cat-facts application \n an application with facts about cats")
            Spacer(modifier = Modifier.height(70.dp))
            Button(onClick = {
                    navController.navigate("catFact")
            }) {
                Text(text = "Get a cat fact")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {

}

