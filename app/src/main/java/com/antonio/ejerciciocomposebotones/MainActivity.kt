package com.antonio.ejerciciocomposebotones

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.antonio.ejerciciocomposebotones.ui.theme.EjercicioComposeBotonesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjercicioComposeBotonesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //EjComposeBotones()
                    EjComposeBotones2()
                }
            }
        }
    }


}

@Composable
fun EjComposeBotones() {
    var contadorButton1 by rememberSaveable { mutableStateOf(0) }
    var contadorButton2 by rememberSaveable { mutableStateOf(0) }
    var contadorButton3 by rememberSaveable { mutableStateOf(0) }
    var contadorButton3b by rememberSaveable { mutableStateOf(0) }
    var contadorButton4 by rememberSaveable { mutableStateOf(0) }
    var contadorButton4b by rememberSaveable { mutableStateOf(0) }
    var contadorButton5 by rememberSaveable { mutableStateOf(0) }
    var contadorButton5b by rememberSaveable { mutableStateOf(0) }
    var contadorButton6 by rememberSaveable { mutableStateOf(0) }
    var contadorButton6b by rememberSaveable { mutableStateOf(0) }
    var contadorButton7 by rememberSaveable { mutableStateOf(0) }
    var contadorButton7b by rememberSaveable { mutableStateOf(0) }


    Column(
        verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { contadorButton1++ },
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton1", color = Color.Black)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { contadorButton2++ },
                colors = ButtonDefaults.buttonColors(Color.Green),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton2", color = Color.Black)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton3b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton3++ },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton3", color = Color.Black)
            }
            Text(text = "$contadorButton3b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Column(modifier = Modifier.background(Color.Yellow)) {
                Row(modifier = Modifier
                    .clickable { contadorButton4b++ }
                    .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        onClick = { contadorButton4++ },
                        colors = ButtonDefaults.buttonColors(Color.Magenta),
                        shape = RectangleShape
                    ) {
                        Text(text = "$contadorButton4", color = Color.Black)
                    }
                    Text(text = "$contadorButton4b")
                }

            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton5b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton5++ },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton5", color = Color.Black)
            }
            Text(text = "$contadorButton5b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton6b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton6++ },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton6", color = Color.Black)
            }
            Text(text = "$contadorButton6b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton7b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton7++ },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton7")
            }
            Text(text = "$contadorButton7b")
        }


    }

}

@Composable
fun EjComposeBotones2() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context = LocalContext.current
        Button(onClick = {
            showToast("ButtonConButton", context)
        }) {
            Text(text = "ButtonConButton")
        }
        Button(modifier = Modifier.border(4.dp, Color.Blue, shape = CircleShape),
            colors = ButtonDefaults.buttonColors(Color.Magenta),

            onClick = {
                showToast("ButtonEnText", context)
            }) {
            Text(text = "ButtonEnText", color = Color.Black)
        }
        Button(onClick = {
            showToast("ButtonEnBox", context)
        }) {
            Text(text = "ButtonEnBox")
        }
    }

}

private fun showToast(string: String, context: Context) {

    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    EjercicioComposeBotonesTheme {
        EjComposeBotones2()
    }
}