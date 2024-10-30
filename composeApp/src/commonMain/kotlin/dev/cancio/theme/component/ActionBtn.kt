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
                type.bgColor,
                RoundedCornerShape(15.dp)
            )
            .clickable { onClick() }

    ){
        Text(
            text,
            style = NORMAL(),
            color = type.textColor
        )
    }
}

enum class ActionBtnType(
    val bgColor: Color = Color.Transparent,
    val textColor: Color = MagicMathColor.BUTTON_SECONDARY.dark
) {
    PRIMARY(MagicMathColor.BUTTON_PRIMARY.dark),
    SECONDARY(MagicMathColor.BUTTON_SECONDARY.dark),
    NEGATIVE(MagicMathColor.NEGATIVE.dark),
    GITHUB(MagicMathColor.ATC.dark),
    ATC(MagicMathColor.ATC.dark),
    NONE
}