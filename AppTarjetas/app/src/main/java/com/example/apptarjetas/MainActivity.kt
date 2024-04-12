package com.example.apptarjetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo()
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = stringResource(id = R.string.full_name))
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = stringResource(id = R.string.tittle))
        Text(text = stringResource(id = R.string.number))
        Text(text = stringResource(id = R.string.carrera))
        Text(text = stringResource(id = R.string.email))
    }
}

@Composable
fun Logo() {
    val logo: Painter = painterResource(id = R.drawable.android_logo)
    Image(painter = logo, contentDescription = "Logo")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}