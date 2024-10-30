package dev.cancio.theme.color

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
    dark: Color,
    light: Color
){
    BACKGROUND_PRIMARY(purple03,purple08),
    BACKGROUND_SECONDARY(purple07,purple05),
    BUTTON_PRIMARY(purple04,purple06),
    BUTTON_SECONDARY(white,purple02),
    ATC(green01,green02),
    NEGATIVE(red01,red02),
    ATTENTION(purple01,pink),
}