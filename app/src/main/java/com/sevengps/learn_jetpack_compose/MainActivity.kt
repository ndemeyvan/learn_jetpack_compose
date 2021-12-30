package com.sevengps.learn_jetpack_compose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sevengps.learn_jetpack_compose.ui.theme.Learn_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Learn_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Item(weight = 3f, color = MaterialTheme.colors.secondary)
                        Item(weight = 1f, color = MaterialTheme.colors.primary)
                    }
                }
            }
        }
    }
}


///Certaine propriete de colonne pour
// etre utiliser doivent etre dans le scope de la colonne
//D'ou l'importance d'ajouter un ColumnScope/RowScope
@Composable
fun RowScope.Item(weight: Float, color: androidx.compose.ui.graphics.Color) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Learn_jetpack_composeTheme {
        //Le modifier Modifier.fillMaxSize() demande de remplir l'ecran
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Item(weight = 3f, color = MaterialTheme.colors.secondary)
            Item(weight = 1f, color = MaterialTheme.colors.primary)
        }

    }
}