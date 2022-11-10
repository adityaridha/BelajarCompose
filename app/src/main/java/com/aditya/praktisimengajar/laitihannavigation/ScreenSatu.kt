package com.aditya.praktisimengajar.laitihannavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.aditya.praktisimengajar.R


@Composable
fun ScreenSatu(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.logo_polban), contentDescription = "polban")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(NavRoute.screen_dua.name)
            }) {
            Text(text = "Welcome to Polban App")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenSatuPreview() {
    ScreenSatu(rememberNavController())
}