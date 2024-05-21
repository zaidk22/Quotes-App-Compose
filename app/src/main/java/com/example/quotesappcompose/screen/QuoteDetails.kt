package com.example.quotesappcompose.screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesappcompose.R
import com.example.quotesappcompose.models.QuotesModel

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable

fun  QuoteDetails(quote: QuotesModel){
    Box(modifier =
    Modifier
        .fillMaxSize(1f)
        .background(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFffffff),
                    Color(0xFFE3E3E3),
                )
            )
        )
    ) {

        Card(elevation = CardDefaults.elevatedCardElevation(
            4.dp
        ),
            modifier = Modifier.padding(32.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(
                        16.dp,
                        24.dp
                    )
            ) {
                Image(imageVector = Icons.Filled.Favorite, contentDescription ="" ,
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180f)

                )

                Text(text = quote.text,

                    )
                Spacer(modifier = Modifier.height(16.dp))

                Text(text = quote.author,
                    fontFamily = FontFamily(Font(R.font.jersey15_regular))

                )


            }

        }

    }

}

