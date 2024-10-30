package dev.cancio.theme.icons.core

import dev.cancio.theme.icons.MagicMathIcon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MagicMathIcon.GitHub: ImageVector
    get()  = ImageVector.Builder(
            name = "Icon",
            defaultWidth = 36.dp,
            defaultHeight = 35.dp,
            viewportWidth = 36f,
            viewportHeight = 35f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 0.5f)
                curveTo(8.331f, 0.5f, 0.5f, 8.331f, 0.5f, 18f)
                curveTo(0.5f, 25.744f, 5.509f, 32.284f, 12.466f, 34.603f)
                curveTo(13.341f, 34.756f, 13.669f, 34.231f, 13.669f, 33.772f)
                curveTo(13.669f, 33.356f, 13.647f, 31.978f, 13.647f, 30.513f)
                curveTo(9.25f, 31.322f, 8.113f, 29.441f, 7.762f, 28.456f)
                curveTo(7.566f, 27.953f, 6.713f, 26.4f, 5.969f, 25.984f)
                curveTo(5.356f, 25.656f, 4.481f, 24.847f, 5.947f, 24.825f)
                curveTo(7.325f, 24.803f, 8.309f, 26.094f, 8.637f, 26.619f)
                curveTo(10.212f, 29.266f, 12.728f, 28.522f, 13.734f, 28.063f)
                curveTo(13.887f, 26.925f, 14.347f, 26.159f, 14.85f, 25.722f)
                curveTo(10.956f, 25.284f, 6.887f, 23.775f, 6.887f, 17.081f)
                curveTo(6.887f, 15.178f, 7.566f, 13.603f, 8.681f, 12.378f)
                curveTo(8.506f, 11.941f, 7.894f, 10.147f, 8.856f, 7.741f)
                curveTo(8.856f, 7.741f, 10.322f, 7.281f, 13.669f, 9.534f)
                curveTo(15.069f, 9.141f, 16.556f, 8.944f, 18.044f, 8.944f)
                curveTo(19.531f, 8.944f, 21.019f, 9.141f, 22.419f, 9.534f)
                curveTo(25.766f, 7.259f, 27.231f, 7.741f, 27.231f, 7.741f)
                curveTo(28.194f, 10.147f, 27.581f, 11.941f, 27.406f, 12.378f)
                curveTo(28.522f, 13.603f, 29.2f, 15.156f, 29.2f, 17.081f)
                curveTo(29.2f, 23.797f, 25.109f, 25.284f, 21.216f, 25.722f)
                curveTo(21.85f, 26.269f, 22.397f, 27.319f, 22.397f, 28.959f)
                curveTo(22.397f, 31.3f, 22.375f, 33.181f, 22.375f, 33.772f)
                curveTo(22.375f, 34.231f, 22.703f, 34.778f, 23.578f, 34.603f)
                curveTo(30.491f, 32.284f, 35.5f, 25.722f, 35.5f, 18f)
                curveTo(35.5f, 8.331f, 27.669f, 0.5f, 18f, 0.5f)
                close()
            }
        }.build()