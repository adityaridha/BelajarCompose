package com.aditya.praktisimengajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.praktisimengajar.ui.theme.PraktisiMengajarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            GreetingWithTheme("Himatel")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingWithTheme(name: String = "4NK") {
    PraktisiMengajarTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
                Text(
                    text = "Hello $name!",
                    fontSize = 36.sp,
                    color = Color.Blue,
                )
                Text(
                    text = "Praktisi Mengajar"
                )
                Text(
                    text = "Oktober - 2022"
                )
        }
    }
}
