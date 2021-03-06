package dev.pinakin.www.compose.playground

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.pinakin.www.compose.playground.friends.FriendsScreen
import dev.pinakin.www.compose.playground.ui.theme.ComposePlayGroundTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlayGroundTheme {
                FriendsScreen(viewModel())
            }
        }
    }
}

@Preview(showSystemUi = true,showBackground = true)
@Composable
fun FriendsScreenPreview(){
    ComposePlayGroundTheme {
        FriendsScreen(viewModel())
    }
}