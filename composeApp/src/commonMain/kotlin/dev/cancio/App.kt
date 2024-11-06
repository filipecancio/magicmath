package dev.cancio

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import dev.cancio.presentation.home.HomeScreen
import dev.cancio.theme.color.getMagicMathColor
import dev.cancio.theme.font.MagicMathType
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = getMagicMathColor(),
        typography = MagicMathType()
    ) {
        Surface {
            HomeScreen()
        }
    }
}