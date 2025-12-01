package week7_gui.qho543_week7_gui

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

// main.kt
fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Hello World") {
        App()
    }
}