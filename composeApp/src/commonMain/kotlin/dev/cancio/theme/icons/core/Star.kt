package dev.cancio.theme.icons.core

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.cancio.theme.icons.MagicMathIcon

val MagicMathIcon.Star: ImageVector
    get()  = ImageVector.Builder(
            name = "Star 1",
            defaultWidth = 47.dp,
            defaultHeight = 47.dp,
            viewportWidth = 47f,
            viewportHeight = 47f
        ).apply {
            path(fill = SolidColor(Color(0xFFD869FF))) {
                moveTo(21.036f, 2.051f)
                curveTo(21.54f, -0.684f, 25.46f, -0.684f, 25.964f, 2.051f)
                lineTo(28.604f, 16.386f)
                curveTo(28.793f, 17.408f, 29.592f, 18.207f, 30.614f, 18.396f)
                lineTo(44.949f, 21.036f)
                curveTo(47.684f, 21.54f, 47.684f, 25.46f, 44.949f, 25.964f)
                lineTo(30.614f, 28.604f)
                curveTo(29.592f, 28.793f, 28.793f, 29.592f, 28.604f, 30.614f)
                lineTo(25.964f, 44.949f)
                curveTo(25.46f, 47.684f, 21.54f, 47.684f, 21.036f, 44.949f)
                lineTo(18.396f, 30.614f)
                curveTo(18.207f, 29.592f, 17.408f, 28.793f, 16.386f, 28.604f)
                lineTo(2.051f, 25.964f)
                curveTo(-0.684f, 25.46f, -0.684f, 21.54f, 2.051f, 21.036f)
                lineTo(16.386f, 18.396f)
                curveTo(17.408f, 18.207f, 18.207f, 17.408f, 18.396f, 16.386f)
                lineTo(21.036f, 2.051f)
                close()
            }
        }.build()
