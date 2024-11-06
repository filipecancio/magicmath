package dev.cancio.theme.color

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color

private val purple01 = Color(0XFF16031D)
private val purple02 = Color(0XFF31113D)
private val purple03 = Color(0XFF410C54)
private val purple04 = Color(0XFF56116F)
private val purple05 = Color(0XFFC625FF)
private val purple06 = Color(0XFFC43AF4)
private val purple07 = Color(0XFFD869FF)
private val purple08 = Color(0XFFEEBEFF)

private val white = Color(0XFFFFFFFF)

private val pink = Color(0XFFFF005C)

private val red01 = Color(0XFFD02828)
private val red02 = Color(0XFFFF6D6D)

private val green01 = Color(0XFF2B6D41)
private val green02 = Color(0XFF4AE37D)

enum class MagicMathColor(
    val dark: Color,
    val light: Color
){
    BACKGROUND_PRIMARY(purple03,purple08),
    BACKGROUND_SECONDARY(purple07,purple05),
    BUTTON_PRIMARY(purple04,purple06),
    BUTTON_SECONDARY(white,purple02),
    ATC(green01,green02),
    NEGATIVE(red01,red02),
    ATTENTION(purple01,pink),
    NONE(Color.Transparent,Color.Transparent),
    WHITE(white, white);

    @Composable
    fun toColor() = if (isSystemInDarkTheme()) this.dark else this.light
}

@Composable
fun getMagicMathColor(): Colors = Colors(
    primary = MagicMathColor.BUTTON_PRIMARY.toColor(),
    primaryVariant = MagicMathColor.BUTTON_SECONDARY.toColor(),
    secondary = MagicMathColor.BUTTON_SECONDARY.toColor(),
    secondaryVariant = MagicMathColor.BUTTON_PRIMARY.toColor(),
    background = MagicMathColor.BACKGROUND_PRIMARY.toColor(),
    surface = MagicMathColor.BACKGROUND_PRIMARY.toColor(),
    error = MagicMathColor.NEGATIVE.toColor(),
    onPrimary = MagicMathColor.BACKGROUND_PRIMARY.toColor(),
    onSecondary = MagicMathColor.BACKGROUND_SECONDARY.toColor(),
    onBackground = MagicMathColor.BACKGROUND_PRIMARY.toColor(),
    onSurface = MagicMathColor.BACKGROUND_PRIMARY.toColor(),
    onError = MagicMathColor.ATTENTION.toColor(),
    isLight = isSystemInDarkTheme()
)

@Composable
fun blinkWhite(): Color {
    val infiniteTransition = rememberInfiniteTransition(label = "blinkWhite")
    val color = if(isSystemInDarkTheme()) white else purple05

    val offset by infiniteTransition.animateFloat(
        initialValue= 0.2f,
        targetValue = 0.7f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "blinkWhite"
    )
    return color.copy(alpha = offset)
}