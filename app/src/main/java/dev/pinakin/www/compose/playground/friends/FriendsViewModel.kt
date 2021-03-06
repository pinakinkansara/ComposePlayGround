package dev.pinakin.www.compose.playground.friends

import androidx.lifecycle.ViewModel
import dev.pinakin.www.compose.playground.Friends
import dev.pinakin.www.compose.playground.R

class FriendsViewModel : ViewModel() {

    fun getFriends() = listOf(
        Friends(R.drawable.ic_launcher_background, "Jhon"),
        Friends(R.drawable.ic_launcher_background, "Obama")
    )
}