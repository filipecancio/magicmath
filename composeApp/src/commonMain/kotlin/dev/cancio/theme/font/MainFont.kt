package dev.cancio.theme.font

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import magicmath.composeapp.generated.resources.Res
import magicmath.composeapp.generated.resources.combo
import org.jetbrains.compose.resources.Font


@Composable
fun getComboFamily() = FontFamily(Font(Res.font.combo))

@Composable
fun getAbelFamily() = FontFamily(Font(Res.font.combo))

@Composable
fun TITLE() = TextStyle(
    fontFamily = getComboFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 60.sp,
    lineHeight = 22.sp
)
@Composable
fun H1() = TextStyle(
    fontFamily = getComboFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 50.sp,
    lineHeight = 22.sp
)

@Composable
fun H2() = TextStyle(
    fontFamily = getAbelFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 50.sp,
    lineHeight = 22.sp
)

@Composable
fun H3() = TextStyle(
    fontFamily = getAbelFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 30.sp,
    lineHeight = 22.sp
)

@Composable
fun H4() = TextStyle(
    fontFamily = getComboFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 30.sp,
    lineHeight = 22.sp
)

@Composable
fun NORMAL() = TextStyle(
    fontFamily = getAbelFamily(),
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp,
    lineHeight = 22.sp
)