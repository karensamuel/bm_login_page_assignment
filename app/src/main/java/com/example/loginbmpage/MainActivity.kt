package com.example.loginbmpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginbmpage.ui.theme.LoginBmPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginBmPageTheme {

           LoginPage()
            }
        }
    }
}

@Composable
fun LoginPage( modifier: Modifier = Modifier) {
Column {
    Header()
    Middle()
    Footer()
}

    }



@Preview(showBackground = true, showSystemUi = true, locale = "ar")
@Composable
fun LoginPagePreview() {
    LoginBmPageTheme {
      LoginPage()
    }
}

