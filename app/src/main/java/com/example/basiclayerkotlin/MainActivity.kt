package com.example.basiclayerkotlin  // Nama package tempat file ini berada

// Import library yang dibutuhkan
import android.os.Bundle
import androidx.activity.ComponentActivity        // Activity dasar untuk Jetpack Compose
import androidx.activity.compose.setContent       // Untuk menampilkan UI berbasis Compose
import androidx.activity.enableEdgeToEdge         // Agar tampilan bisa sampai ke tepi layar (edge-to-edge)
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold        // Layout dasar dengan struktur (topbar, content, dsb)
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable        // Penanda bahwa fungsi bisa digunakan di UI Compose
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview // Untuk menampilkan preview di Android Studio
import com.example.basiclayerkotlin.ui.theme.BasicLayerKotlinTheme // Tema aplikasi


// ===============================
// 🌟 MainActivity (activity utama aplikasi)
// ===============================
class MainActivity : ComponentActivity() { // Kelas utama aplikasi yang mewarisi ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Memanggil fungsi bawaan Activity saat dibuat

        enableEdgeToEdge() // Mengaktifkan mode edge-to-edge (konten bisa tampil hingga ke area status bar)

        setContent { // Menentukan isi tampilan aplikasi menggunakan Jetpack Compose
            BasicLayerKotlinTheme { // Menerapkan tema dari folder ui.theme
                Scaffold( // Struktur dasar halaman (bisa menampung top bar, bottom bar, dsb)
                    modifier = Modifier.fillMaxSize() // Scaffold mengisi layar penuh
                ) { innerPadding -> // innerPadding = jarak otomatis agar konten tidak ketabrak sistem UI (status bar, navbar)
                    // Memanggil fungsi composable buatanmu untuk menampilkan isi layout
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding) // Menerapkan padding dari Scaffold
                    )
                }
            }
        }
    }
}


// ===============================
// 👋 Fungsi Composable sederhana (menampilkan teks Hello ...)
// ===============================
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Menampilkan teks dengan parameter "name"
    Text(
        text = "Hello $name!", // Menampilkan teks "Hello <nama>!"
        modifier = modifier    // Modifier digunakan jika ingin menambahkan padding, warna, dll.
    )
}


// ===============================
// 🧩 Fungsi Preview untuk melihat tampilan di Android Studio
// ===============================
@Preview(showBackground = true) // Menampilkan latar belakang putih agar tampilan jelas di preview
@Composable
fun GreetingPreview() {
    BasicLayerKotlinTheme { // Gunakan tema aplikasi
        Greeting("Android") // Menampilkan teks "Hello Android!" di preview
    }
}
