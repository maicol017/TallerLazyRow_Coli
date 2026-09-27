package me.maicolgutierrez.tallerlazyrowcoli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.maicolgutierrez.tallerlazyrowcoli.ui.screens.FeedScreen
import me.maicolgutierrez.tallerlazyrowcoli.ui.theme.TallerLazyRowColiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TallerLazyRowColiTheme {
                FeedScreen()
            }
        }
    }
}