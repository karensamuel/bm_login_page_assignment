package com.example.loginbmpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun Footer(modifier: Modifier = Modifier) {
    val imgList = intArrayOf(R.drawable.our_products,R.drawable.exchange_rate,R.drawable.security_tips,R.drawable.nearest_branch_or_atm)
    val stringList = intArrayOf(R.string.our_products,R.string.exchange_rate,R.string.security_tips,R.string.nearest_bransh_or_atm)

        Divider(
            color = Color.Gray,    // Custom color
            thickness = 2.dp,      // Custom thickness
            modifier = Modifier.padding(horizontal = 16.dp) // Optional padding
        )
    Row(modifier = modifier.fillMaxSize().padding(all = 4.dp), horizontalArrangement = Arrangement.SpaceEvenly){
        for((img, desc) in imgList.zip(stringList)){
            DrawColmn(img, desc)
        }
    }

}

@Composable
fun DrawColmn ( image:Int, s: Int,modifier: Modifier = Modifier){
    val textsize =100.dp
    val imageSize = 64.dp
    Column (modifier=modifier.fillMaxHeight().fillMaxHeight()  ,horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Image(
            painter = painterResource(id = image), contentDescription = "our product",
            modifier = modifier.size(imageSize),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(s),modifier=modifier.size(textsize).fillMaxWidth(),
            overflow = TextOverflow.Visible, textAlign = TextAlign.Center,
                )
    }}