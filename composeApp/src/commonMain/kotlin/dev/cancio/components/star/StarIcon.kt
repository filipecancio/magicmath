package dev.cancio.components.star

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.cancio.theme.color.MagicMathColor
import dev.cancio.theme.color.blinkStar
import dev.cancio.theme.icons.MagicMathIcon
import dev.cancio.theme.icons.core.Star
import kotlin.random.Random

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
                .size(pulseStar(size)),
            tint = blinkStar()
        )
        Icon(
            MagicMathIcon.Star,
            null,
            modifier = Modifier
                .size(pulseStar(size.minus(10.dp))),
            tint = MagicMathColor.BACKGROUND_SECONDARY.toColor()
        )
    }
}
@Composable
fun pulseStar(size: Dp): Dp {
    val infiniteTransition = rememberInfiniteTransition(label = "pulseStar")
    val initialValue = remember { if (Random.nextBoolean()) 0.5f else 1f }
    val targetValue = if (initialValue == 0.5f) 1f else 0.5f

    val offset by infiniteTransition.animateFloat(
        initialValue= initialValue,
        targetValue = targetValue,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulseStar"
    )
    return size.times(offset)
}