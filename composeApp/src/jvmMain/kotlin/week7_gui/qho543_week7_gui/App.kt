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
fun FeetToMetresConverter() {
    // Store the input as a String
    val feetState = remember { mutableStateOf("") }

    // Try to convert to Double; if it fails, use 0.0
    val feetValue = feetState.value.toDoubleOrNull() ?: 0.0
    val metres = feetValue * 0.305

    Column {
        TextField(value = feetState.value, onValueChange = { feetState.value = it },
            label = { Text("Enter feet:") })
        Text("Metres: $metres")
    }
}

@Composable
fun App() {
    MaterialTheme {
        Column {
            FeetToMetresConverter()
        }
    }
}

