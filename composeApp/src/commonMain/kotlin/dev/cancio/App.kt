package dev.cancio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cancio.presentation.home.HomeScreen
import dev.cancio.theme.color.getMagicMathColor
import dev.cancio.theme.font.MagicMathType
import dev.cancio.theme.icons.MagicMathIcon
import dev.cancio.theme.icons.core.Star
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = getMagicMathColor(),
        typography = MagicMathType()
    ) {
        Surface {
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

                HomeScreen()
                Icon(
                    MagicMathIcon.Star,
                    null,
                    modifier = Modifier.size(100.dp)
                )
            }
        }
    }
}