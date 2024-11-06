package dev.cancio.components.star

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StarBackground() = Box(
    modifier = Modifier.fillMaxSize()
){
    StarIcon(
        modifier = Modifier.offset(131.dp,50.dp),
        size = 15.dp
    )
    StarIcon(
        modifier = Modifier.offset(255.dp,50.dp),
        size = 29.dp
    )
    StarIcon(
        modifier = Modifier.offset(62.dp,169.dp),
        size = 47.dp
    )

    StarIcon(
        modifier = Modifier.offset(292.dp,287.dp),
        size = 15.dp
    )
    StarIcon(
        modifier = Modifier.offset(52.dp,533.dp),
        size = 29.dp
    )
    StarIcon(
        modifier = Modifier.offset(312.dp,533.dp),
        size = 15.dp
    )

    StarIcon(
        modifier = Modifier.offset(270.dp,617.dp),
        size = 47.dp
    )
    StarIcon(
        modifier = Modifier.offset(198.dp,687.dp),
        size = 20.dp
    )
    StarIcon(
        modifier = Modifier.offset(52.dp,768.dp),
        size = 20.dp
    )


}