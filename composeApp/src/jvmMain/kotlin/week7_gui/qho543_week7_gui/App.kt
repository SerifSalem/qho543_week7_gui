package week7_gui.qho543_week7_gui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun HelloWorld() {
    Text("Hello World from the Custom Composable!")
}

@Composable
fun TwoTexts() {
    Column {
        Text("Hello World! ")
        Text("Welcome to Compose Multiplatform Development")
    }
}

@Composable
fun TwoTextsStyled() {
    Column {
        Text("Hello World!", color = Color.Red, fontStyle= FontStyle.Italic, fontFamily=FontFamily.Serif)
        Text("Hello World!", fontSize=24.sp)
        Text("Welcome to Compose Multiplatform Development", fontWeight= FontWeight.Bold)
    }
}

@Composable
fun MultiMessage(message: String, nTimes: Int, colour: Color = Color.Black) {
    Column {
        for(i in 1..nTimes) {
            Text(message, color=colour)
        }
    }
}

@Composable
fun GreetingBox() {
    val nameState = remember { mutableStateOf("") }
    Column {
        TextField(value = nameState.value, onValueChange= {
            nameState.value = it
        })
        Text("Hello ${nameState.value}!")
    }
}

@Composable
fun App() {
    MaterialTheme {
        Column {
            GreetingBox()
        }
    }
}