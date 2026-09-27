package me.maicolgutierrez.tallerlazyrowcoli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.maicolgutierrez.tallerlazyrowcoli.model.Post
import me.maicolgutierrez.tallerlazyrowcoli.ui.theme.TallerLazyRowColiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //
        val post = Post(
            id = 1,
            username = "yo",
            profileImageUrl = "https://picsum.photos/seed/test/200/200",
            imageUrl = "https://picsum.photos/seed/test/800/800",
            likes = 100,
            caption = "Probando mi data class"
        )
        println(post)


        val postLiked = post.copy(isLiked = true)
        println(postLiked)

        setContent {
            TallerLazyRowColiTheme {

            }
        }
    }
}