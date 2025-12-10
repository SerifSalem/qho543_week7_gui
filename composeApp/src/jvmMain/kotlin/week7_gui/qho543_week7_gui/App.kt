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
fun LoginMockup() {
    val usernameState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }
    val loggedInState = remember { mutableStateOf(false) }
    val errorMessageState = remember { mutableStateOf("") }

    Column {
        if (!loggedInState.value) {
            // Login form
            TextField(value = usernameState.value, onValueChange = { usernameState.value = it },
                label = { Text("Username") }, singleLine = true)
            TextField(value = passwordState.value, onValueChange = { passwordState.value = it },
                label = { Text("Password") }, singleLine = true)
            Button(onClick = {
                if (usernameState.value == "alex" && passwordState.value == "password") {
                    loggedInState.value = true
                    errorMessageState.value = ""
                } else {errorMessageState.value = "Incorrect username or password"}
            }) {Text("Login")}

            if (errorMessageState.value.isNotEmpty()) {Text(errorMessageState.value, color = Color.Red)}
        } else {Text("Logged in as ${usernameState.value}")
            Button(onClick = {
                loggedInState.value = false
                passwordState.value = ""
            }) {Text("Logout")}
        }
    }
}

@Composable
fun App() {
    MaterialTheme {
        Column {
            LoginMockup()
        }
    }
}

