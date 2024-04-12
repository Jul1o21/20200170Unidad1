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
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.sp

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
            .padding(16.dp)
            .background(Color(0xFF9ED19E)), // Cambio de fondo a verde oscuro
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(Modifier.fillMaxWidth()) {
            Row(Modifier.weight(1f)) {
                    ComposableLogo(
                        modifier = Modifier.weight(1f),
                        backgroundColor = Color(0xFF464688)
                    )
                }
            Row(Modifier.weight(1f)){
                ComposableTitulo(
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                ComposableDatos(
                    modifier = Modifier.weight(1f)
                )

            }
        }

        
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

@Composable
private fun ComposableLogo(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent // Por defecto, el fondo es transparente
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo()
    }
}
@Composable
private fun ComposableTitulo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.full_name),
            fontSize = 24.sp
        )
        Text(text = stringResource(id = R.string.tittle))
    }
}
@Composable
private fun ComposableDatos(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.number))
        Text(text = stringResource(id = R.string.carrera))
        Text(text = stringResource(id = R.string.email))
    }
}