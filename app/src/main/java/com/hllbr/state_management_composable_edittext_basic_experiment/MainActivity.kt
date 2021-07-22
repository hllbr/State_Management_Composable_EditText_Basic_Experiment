package com.hllbr.state_management_composable_edittext_basic_experiment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hllbr.state_management_composable_edittext_basic_experiment.ui.theme.State_Management_Composable_EditText_Basic_ExperimentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    androidx.compose.material.Surface(color = Color.DarkGray) {
        Column(modifier = Modifier.fillMaxSize()
            ,verticalArrangement = Arrangement.Center
            ,horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var myString = "Android Compose"
            TextField(value = TextFieldValue(text = myString)
                ,onValueChange = {
                myString = it.text
                    println(myString)//bu noktada state management denilen bir yapıdan yararlanmak gerekiyor.

                }
                /*
                içerisinde biri gelip bir değer yazdığında yani mevcut değer değiştiğinde ne yapılmasını istiyorsak belirtebildiğimiz bir yapı bulundurmakta TextField yapısı EditText formatının gelişmiş bir formu olarak ifade edebiliiriz
                Bu kolaylığı bize sağlayan ifadenin adı onValueChange tir.
                TextField yapısı için Buton yapısında belirtilen birden fazla composable ifade alabilme durumunu aynen tanımlayabiliriz.

            */
            )


            Spacer(modifier = Modifier.padding(7.dp))
            var textString = "Hello"
            Text(text = textString,color = Color.White
                ,fontSize = 26.sp
                ,fontStyle = FontStyle.Normal)

            Spacer(modifier = Modifier.padding(7.dp))
            Button(onClick = {
                textString = "Android"
                println(textString)//bu noktada state management denilen bir yapıdan yararlanmak gerekiyor.
            }) {
                /*
                Butonlar içersinede bir composable yerleştirilebilir.
                Butonlar içerisine birden fazla composable yerleştirilebilir.
                 */
                Text(text = "Button / ")
                Spacer(modifier = Modifier.padding(7.dp))
                Text(text = "Button Test")
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()

}