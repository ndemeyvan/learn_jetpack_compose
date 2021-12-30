package com.sevengps.learn_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sevengps.learn_jetpack_compose.ui.theme.Learn_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Learn_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CustomText()
                }
            }
        }
    }
}


@Composable
fun CustomText() {
    Column(Modifier.fillMaxSize()) {
       SelectionContainer() {
           Column {
               Text(
                   text = stringResource(id = R.string.app_name),
                   modifier = Modifier
                       .background(MaterialTheme.colors.primary)
                       .padding(16.dp)
                       .width(250.dp),
                   fontSize = MaterialTheme.typography.h6.fontSize,
                   fontWeight = FontWeight.Bold,
                   fontStyle = FontStyle.Normal,
                   color = Color.White,
                   textAlign = TextAlign.Center
               )
               DisableSelection {
                   Text(text = "Yvan Ndeme")
               }
               Text(text = "Android Dev")
           }
       }
    }
}

//Facont de creer des textes comme Richtext en flutter
@Composable
fun annotetedString() {
    Column(Modifier.fillMaxSize()) {
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                    withStyle(style = SpanStyle(color = Color.Green, fontSize = 30.sp)) {
                        append("A")
                    }
                    append("B")
                    append("C")
                    append("D")
                }

            },
            modifier = Modifier.width(200.dp)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Learn_jetpack_composeTheme {
        CustomText()
//        annotetedString()
    }
}