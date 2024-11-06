package dev.cancio.theme.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.cancio.theme.color.MagicMathColor
import dev.cancio.theme.font.NORMAL
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ActionBtn(
    text:String = "Magic Math",
    type: ActionBtnType,
    onClick: ()->Unit
) {
    Box(
        modifier = Modifier
            .size(
            width = 171.dp,
            height = 62.dp
            )
            .background(
                type.bgColor.toColor(),
                RoundedCornerShape(15.dp)
            )
            .clickable { onClick() }

    ){
        Text(
            text,
            style = NORMAL(),
            color = type.textColor.toColor()
        )
    }
}

enum class ActionBtnType(
    val bgColor: MagicMathColor = MagicMathColor.NONE,
    val textColor: MagicMathColor = MagicMathColor.BUTTON_SECONDARY
) {
    PRIMARY(MagicMathColor.BUTTON_PRIMARY),
    SECONDARY(MagicMathColor.BUTTON_SECONDARY),
    NEGATIVE(MagicMathColor.NEGATIVE),
    GITHUB(MagicMathColor.ATC),
    ATC(MagicMathColor.ATC),
    NONE(MagicMathColor.NONE)
}