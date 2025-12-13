package week7_gui.qho543_week7_gui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun HelloWorld() {
    Text("Hello World from the Custom Composable!")
}

@Composable
fun App() {
    MaterialTheme {
        HelloWorld()
    }
}