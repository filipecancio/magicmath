package dev.cancio.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cancio.components.star.StarBackground
import dev.cancio.components.star.StarIcon
import dev.cancio.theme.color.MagicMathColor
import dev.cancio.theme.component.ActionBtn
import dev.cancio.theme.component.ActionBtnType
import dev.cancio.theme.font.H1
import dev.cancio.theme.font.H3
import dev.cancio.theme.font.NORMAL

@Composable
fun HomeScreen() {
    Scaffold(){
        Box{
            StarBackground()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.padding(horizontal = 24.dp)
                    .padding(top = 100.dp)
            ) {

                Text(
                    "Magic Math",
                    style = H1(),
                    color = MagicMathColor.BACKGROUND_SECONDARY.toColor()
                )
                Column(
                    modifier = Modifier
                        .padding(top = 115.dp)
                        .padding(end = 50.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
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

                Column(
                    modifier = Modifier
                        .padding(top = 50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    ActionBtn("Começar", ActionBtnType.ATC) {}
                    ActionBtn("Primeira vez", ActionBtnType.PRIMARY) {}
                    ActionBtn("Sobre", ActionBtnType.NONE) {}
                }
            }
        }
    }
}