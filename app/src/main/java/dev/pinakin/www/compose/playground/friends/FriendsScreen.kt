package dev.pinakin.www.compose.playground.friends

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.pinakin.www.compose.playground.Friends
import dev.pinakin.www.compose.playground.R

@Composable
fun FriendsScreen(viewModel: FriendsViewModel) {
    FriendsGrid(friends = viewModel.getFriends(), onFriendSelected = {

    })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FriendsGrid(friends: List<Friends>, onFriendSelected: (Friends) -> Unit) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        content = {
            items(friends.size) { index ->
                FriendGridItem(image = friends[index].profilePic, name = friends[index].name){
                    onFriendSelected(it)
                }
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FriendGridItemPreview() {
    FriendGridItem(image = R.drawable.ic_launcher_background, name = "Pinakin"){

    }
}

@Composable
fun FriendGridItem(@DrawableRes image: Int, name: String, onFriendClick: (Friends) -> Unit) {
    Card(
        modifier = Modifier
            .requiredHeight(180.dp)
            .clip(MaterialTheme.shapes.large)
            .padding(8.dp)
            .clickable {
                onFriendClick(Friends(image, name))
            }
    ) {
        Column {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Image"
            )

            Spacer(modifier = Modifier.requiredHeight(24.dp))

            Text(text = name, style = MaterialTheme.typography.h6)
        }

    }
}