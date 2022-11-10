package com.aditya.praktisimengajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class NavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationApp()
        }
    }
}



@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable(route = "welcome") {
            WelcomeScreen(onButtonClicked = {
                navController.navigate("home")
            })
        }
        composable(route = "home") {
            HomeScreen(onButtonClicked = {
                navController.navigate("welcome")
            })
        }
    }
}


@Composable
fun HomeScreen(onButtonClicked: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = onButtonClicked,
            modifier = Modifier.height(64.dp)
        ) {
            Text(text = "Welcome")
        }
    }
}

@Composable
fun WelcomeScreen(onButtonClicked: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.himatel), contentDescription = "Himatel")
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = onButtonClicked,
            modifier = Modifier.height(64.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF80b0ff),
                contentColor = Color.White
            )
        ) {
            Text(text = "Welcome to Himatel App")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenPreview() {
    HomeScreen({})
}