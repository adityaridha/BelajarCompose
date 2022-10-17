package com.aditya.praktisimengajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.praktisimengajar.ui.theme.PraktisiMengajarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingWithTheme()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingWithTheme() {
    PraktisiMengajarTheme() {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.background(color = MaterialTheme.colorScheme.primary),
                content = {
                    Text(
                        text = "Hello Praktisi Mengajar",
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 0.dp),
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Telkom Polban kelas 4NK - 2022",
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 0.dp),
                        fontSize = 24.sp
                    )
                }
            )
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


//@Preview(name = "Simple Greeting", showSystemUi = true)
//@Composable
//fun DefaultPreview() {
//    PraktisiMengajarTheme {
//        Greeting("Android")
//    }
//}