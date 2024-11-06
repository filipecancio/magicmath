package dev.cancio.components.star

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.cancio.theme.color.MagicMathColor
import dev.cancio.theme.color.blinkWhite
import dev.cancio.theme.icons.MagicMathIcon
import dev.cancio.theme.icons.core.Star

@Composable
fun StarIcon(
    modifier: Modifier = Modifier,
    size: Dp = 100.dp
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.then(modifier)
    ){
        Icon(
            MagicMathIcon.Star,
            null,
            modifier = Modifier
                .blur(10.dp)
                .padding(10.dp)
                .size(size),
            tint = blinkWhite()
        )
        Icon(
            MagicMathIcon.Star,
            null,
            modifier = Modifier
                .size(size.minus(10.dp)),
            tint = MagicMathColor.BACKGROUND_SECONDARY.toColor()
        )
    }
}