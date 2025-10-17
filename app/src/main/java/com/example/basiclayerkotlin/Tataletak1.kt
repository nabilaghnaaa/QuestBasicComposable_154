package com.example.basiclayerkotlin  // Nama package aplikasi

// Import berbagai komponen dari Jetpack Compose
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


// ============================
// 1️⃣ Fungsi Column (tata letak vertikal)
// ============================
@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        // Column = menempatkan elemen secara vertikal (atas ke bawah)
        // padding memberi jarak di sisi atas dan samping

        Text(text = "Komponen1") // Menampilkan teks di baris pertama
        Text(text = "Komponen2") // Baris kedua
        Text(text = "Komponen3") // Baris ketiga
        Text(text = "Komponen4") // Baris keempat
    }
}


// ============================
// 2️⃣ Fungsi Row (tata letak horizontal)
// ============================
@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(), // Row melebar memenuhi lebar layar
        horizontalArrangement = Arrangement.SpaceEvenly // Jarak antar item dibuat rata
    ) {
        Text(text = "Komponen1") // Elemen pertama di baris
        Text(text = "Komponen2") // Elemen kedua
        Text(text = "Komponen3") // Elemen ketiga
        Text(text = "Komponen4") // Elemen keempat
    }
}


// ============================
// 3️⃣ Fungsi Box (menumpuk elemen)
// ============================
@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth() // Isi lebar layar penuh
            .fillMaxHeight(), // Isi tinggi layar penuh
        contentAlignment = Alignment.Center // Semua isi Box disejajarkan ke tengah
    ) {
        // Semua Text di bawah ini akan menumpuk di tengah Box
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}


// ============================
// 4️⃣ Column berisi beberapa Row
// ============================
@Composable
fun TataletakColumRow(modifier: Modifier) {
    Column {
        // Baris pertama
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly // Item diatur rata horizontal
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        // Baris kedua
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1s2")
            Text(text = "Komponen2Baris2s2")
            Text(text = "Komponen3Baris3s2")
        }
    }
}


// ============================
// 5️⃣ Row berisi beberapa Column
// ============================
@Composable
fun TataletakRowColum(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(), // Row memenuhi lebar layar
        horizontalArrangement = Arrangement.SpaceEvenly // Jarak antar kolom rata
    ) {
        // Kolom pertama
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom3")
        }

        // Kolom kedua
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}


// ============================
// 6️⃣ Layout gabungan Box + Column + Row + Gambar
// ============================
@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.exit) // Memuat gambar dari folder drawable

    Column {
        // ---------- Box 1 (atas) ----------
        Box(
            modifier = modifier
                .fillMaxWidth() // lebar penuh
                .height(110.dp) // tinggi 110dp
                .background(color = Color(0xFFFFC1CC)), // warna baby pink
            contentAlignment = Alignment.Center // isi Box di tengah
        ) {
            Column { // Kolom di dalam Box
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // teks dibagi rata
                ) {
                    // Baris pertama dalam Box
                    Text(text = "Col1.Rowl.Komponen1")
                    Text(text = "Col1.Rowl.Komponen2")
                    Text(text = "Col1.Rowl.Komponen3")
                }

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    // Baris kedua dalam Box
                    Text(text = "Col1.Row2.Komponen1")
                    Text(text = "Col1.Row2.Komponen2")
                    Text(text = "Col1.Row2.Komponen3")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp)) // Jarak antar Box atas & bawah

        // ---------- Box 2 (bawah) ----------
        Box(
            modifier = modifier
                .fillMaxWidth() // lebar penuh
                .height(300.dp) // tinggi 300dp
                .background(color = Color(0xFFB3E5FC)), // warna baby blue
            contentAlignment = Alignment.Center // isi Box disejajarkan di tengah
        ) {
            // Menampilkan gambar dari resource
            Image(
                painter = gambar,
                contentDescription = null, // tidak ada deskripsi tambahan
                contentScale = ContentScale.Fit // gambar disesuaikan ke ukuran Box
            )

            // Menampilkan teks di atas gambar (karena Box menumpuk elemen)
            Text(
                text = "My Music",
                fontSize = 50.sp, // ukuran font besar
                color = Color(0xFFFFC1CC), // warna teks baby pink
                fontWeight = FontWeight.Bold, // teks tebal
                fontFamily = FontFamily.Cursive, // gaya tulisan miring / cursive
                modifier = Modifier.align(Alignment.Center) // posisikan teks tepat di tengah
            )
        }
    }
}
