package com.example.appform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appform.ui.theme.AppFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFormTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column (
        Modifier.
        fillMaxSize(),
    ){
        Column {
            Row (
                Modifier.padding(10.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ) {
                Text(text = "APP CADASTRO", fontWeight = FontWeight.Bold, fontSize = 24.sp)
            }

            Row (
                Modifier.padding(6.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Nome") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Endereço") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Bairro") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("CEP") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("CIdade") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Row (
                Modifier.
                fillMaxWidth(),
                Arrangement.Center
            ){
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Estado") }
                )
            }

            Row (
                Modifier.padding(16.dp)
            ){

            }

            Column (
                modifier = Modifier.fillMaxHeight(),
            ){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ){
                    Button(onClick = { /*TODO*/ },
                            Modifier.
                            height(55.dp)
                        ) {
                        Text(text = "Enviar Formulário", fontSize = 20.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    App()
}