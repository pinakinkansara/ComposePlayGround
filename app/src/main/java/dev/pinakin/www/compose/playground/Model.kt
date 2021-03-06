package dev.pinakin.www.compose.playground

import androidx.annotation.DrawableRes

data class Friends(
    @DrawableRes val profilePic: Int,
    val name: String
)