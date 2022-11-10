package com.aditya.praktisimengajar

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class NavigationPassDataActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationApp2()
        }
    }
}

@Composable
fun NavigationApp2() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable(route = "welcome") {
            WelcomeScreen2(navController = navController)
        }

        composable(
            route = "home/{nama}",
            arguments = listOf(navArgument("nama") {
                type = NavType.StringType
            })
        ) {
            val nama = it.arguments?.getString("nama").toString()
            Log.d("Belajar", nama)
            HomeScreen2(navController = navController, nama)
        }
    }
}


@Composable
fun HomeScreen2(navController: NavController, name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                navController.navigate("welcome")
            },
            modifier = Modifier.height(64.dp)
        ) {
            Text(text = "Welcome " + name)
        }
    }
}

@Composable
fun WelcomeScreen2(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.himatel), contentDescription = "Himatel")
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            value = text,
            label = {
                Text(text = "Nama")
            },
            onValueChange = {
                text = it
            })
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {
                navController.navigate("home/$text")
            },
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
fun ScreenPreview2() {
    WelcomeScreen2(rememberNavController())
}