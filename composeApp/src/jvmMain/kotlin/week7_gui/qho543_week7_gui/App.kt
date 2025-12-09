package week7_gui.qho543_week7_gui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
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
fun CounterBox() {
    // State to hold the current counter value, initialised to 0
    val counterState = remember { mutableStateOf(0) }
    Column {
        Text(text = "Counter: ${counterState.value}", color = Color.Red, fontSize = 32.sp)
        Button(onClick = { counterState.value++ }) {Text("Increase")}
    }
}

@Composable
fun App() {
    MaterialTheme {
        Column {
            CounterBox()
        }
    }
}