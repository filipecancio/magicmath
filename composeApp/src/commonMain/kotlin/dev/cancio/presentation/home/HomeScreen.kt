package dev.cancio.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.cancio.theme.color.MagicMathColor
import dev.cancio.theme.component.ActionBtn
import dev.cancio.theme.component.ActionBtnType
import dev.cancio.theme.font.H1
import dev.cancio.theme.font.H3
import dev.cancio.theme.font.NORMAL

@Composable
fun HomeScreen() {
    Column {

        Text(
            "Magic Math",
            style = H1(),
            color = MagicMathColor.BACKGROUND_SECONDARY.toColor()
        )
        Column {
            Text(
                "Divirta-se com esse joguinho de matemática",
                style = H3(),
                color = MagicMathColor.BACKGROUND_SECONDARY.toColor()
            )
            Text(
                "Com a ajuda da matemática, vamos adivinhar um número que você está pensando.",
                style = NORMAL(),
                color = MagicMathColor.BACKGROUND_SECONDARY.toColor()
            )
        }

        Column {
            ActionBtn("Começar", ActionBtnType.ATC){}
            ActionBtn("Primeira vez", ActionBtnType.PRIMARY){}
            ActionBtn("Sobre", ActionBtnType.NONE){}
        }
    }
}