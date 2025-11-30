package week7_gui.qho543_week7_gui

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "qho543_week7_gui",
    ) {
        App()
    }
}