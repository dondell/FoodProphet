package com.dmj.moneytool.ui.components

import androidx.compose.ui.focus.FocusRequester

data class TextFieldState(
    var text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true,
    val focusRequester: FocusRequester
)
