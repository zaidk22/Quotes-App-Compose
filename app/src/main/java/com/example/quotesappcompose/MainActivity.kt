package com.example.quotesappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.quotesappcompose.screen.QuoteList
import com.example.quotesappcompose.screen.QuoteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CoroutineScope(Dispatchers.IO).launch {
            delay(10000)
            DataManager.loadAssetsFromFile(applicationContext)
        }
        setContent {

        App()
                
            }

        }
    }


@Composable
fun App(){

    if(DataManager.isDataLoaded.value==true){
        QuoteListScreen(data = DataManager.data) {
            
        }
    }
            else{
               Box(
                   modifier =Modifier.fillMaxSize(),
                   contentAlignment = Alignment.Center

               ) {
                   CircularProgressIndicator()
               }
    }
}

