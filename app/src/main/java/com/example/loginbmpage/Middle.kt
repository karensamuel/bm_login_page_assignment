package com.example.loginbmpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.loginbmpage.ui.theme.Button_off_Red
import com.example.loginbmpage.ui.theme.Button_on_Red

@Composable
fun Middle(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, top = 32.dp, bottom = 16.dp, end = 16.dp)
            .fillMaxWidth(), // Fill the entire width of the parent
        verticalArrangement = Arrangement.Center, // Center the content vertically
        horizontalAlignment = Alignment.Start
    ) {
        // Name Input
        var username by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier=modifier.fillMaxWidth(),
            value = username,
            onValueChange = { username = it },
            label = { Text(stringResource(R.string.username)) },
            placeholder =  {Text(stringResource(R.string.username))}
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password Input
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }

        OutlinedTextField(
            modifier=modifier.fillMaxWidth(),
            value = password,
            onValueChange = { password = it },
            label = { Text(stringResource(R.string.password)) },
            singleLine = true,
            visualTransformation = if(passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image =if(passwordVisible) R.drawable.ic_visibility_on
                else R.drawable.ic_visibility_off

                 val description =if (passwordVisible)"hide password" else "show password"
                IconButton(onClick = {  passwordVisible=! passwordVisible}) {
                 Icon(painter = painterResource(id = image), contentDescription = description,modifier=modifier.graphicsLayer(scaleX = -1f)  )
                }

            },

        )

        Spacer(modifier = Modifier.height(16.dp))
// Forget pass Input
        Text(text = stringResource(R.string.forget_username_password),
            color = Color.Gray,style = TextStyle(textDecoration = TextDecoration.Underline)
        )

        Spacer(modifier = Modifier.height(32.dp))
        //Button
        val buttonOn = password.isNotEmpty()&& username.isNotEmpty()

        Button(onClick = { }
            , modifier = modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),enabled = buttonOn, colors =  ButtonDefaults.buttonColors( containerColor =Button_on_Red,
                disabledContainerColor = Button_off_Red),
            shape = RoundedCornerShape(12.dp)
        )
        {
            Text(text= stringResource(R.string.login),color=Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Need help
        Text(
            buildAnnotatedString {
                append(stringResource(R.string.need_help))
                withStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.Underline,
                        color = Button_on_Red
                    )
                ) {
                    append(stringResource(R.string.contact_us))
                }
            },
        )
        Spacer(modifier = Modifier.height(32.dp))
    }
}

