package com.example.loginbmpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.loginbmpage.ui.theme.Button_on_Red

@Composable
fun Header(modifier: Modifier = Modifier) {
    Box() {
        // Row for Image and Language Text
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.bm_icon),
                contentDescription = "banque masr",
                modifier = Modifier.padding(end = 100.dp)
            )
            Text(
                text = stringResource(R.string.language),
                textAlign = TextAlign.End,
                color = Button_on_Red,

            )
        }
    }
}