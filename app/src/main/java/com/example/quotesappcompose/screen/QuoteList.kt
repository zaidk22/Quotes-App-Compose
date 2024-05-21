package com.example.quotesappcompose.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesappcompose.models.QuotesModel

@Composable
fun  QuoteList(data:Array<QuotesModel> , onClick: ()->Unit){
    LazyColumn() {
      items(data){
          QuoteListItem(quote = it) {
              onClick()
          }
      }


    }
}