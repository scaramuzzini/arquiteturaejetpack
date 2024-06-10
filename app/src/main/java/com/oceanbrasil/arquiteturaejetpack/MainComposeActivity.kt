package com.oceanbrasil.arquiteturaejetpack

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

class MainComposeActivity : ComponentActivity() {

    private val viewModel: OceanViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel)
        }
    }
}
@Composable
fun MainScreen(viewModel: OceanViewModel) {
    val counter = viewModel.counter.observeAsState(0)
    Column() {
        Text("Contador: ${counter.value}")
        Button(onClick = { viewModel.incrementCounter() }) {
            Text("Contar!!!")
        }
        //MeuBotaoFonteGrande()
    }
}
@Composable
fun MeuBotaoFonteGrande() {
    Button(onClick = { /*TODO*/ }) {
        Text("Este é um botao de texto com fonte grande"
            ,style = TextStyle(fontSize = 48.sp)
        )
    }
}