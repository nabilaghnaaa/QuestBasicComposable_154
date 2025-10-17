package com.example.basiclayerkotlin


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}


@Composable
fun TataletakColumRow(modifier: Modifier) {
    Column() {
        //Baris1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        //Baris2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1s2")
            Text(text = "Komponen2Baris2s2")
            Text(text = "Komponen3Baris3s2")
        }
    }
}

@Composable
fun TataletakRowColum(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom1
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom3")
        }

        //Kolom2
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}


@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.exit)
    Column() {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFFFFC1CC)), // 🎀 Baby Pink
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1.Rowl.Komponen1")
                    Text(text = "Col1.Rowl.Komponen2")
                    Text(text = "Col1.Rowl.Komponen3")
                }

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1.Row2.Komponen1")
                    Text(text = "Col1.Row2.Komponen2")
                    Text(text = "Col1.Row2.Komponen3")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color(0xFFB3E5FC)), // 💙 Baby Blue
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Music",
                fontSize = 50.sp,
                color = Color(0xFFFFC1CC), // teks baby pink
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}