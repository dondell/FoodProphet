package com.dmj.moneytool.ui.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.RadioButtonColors
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: RadioButtonColors = RadioButtonDefaults.colors(),
) {
}

@Composable
@Preview
fun PreviewRadioButton() {
    RadioButton(
        false, {}, modifier = Modifier,
        false,
        remember { MutableInteractionSource() },
        RadioButtonDefaults.colors()
    )
}