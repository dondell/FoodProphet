package com.dmj.moneytool.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dmj.moneytool.presentation.util.FormatAmount

@Composable
fun TextViewContextHeaderWithAmount(
    name: String = "",
    amount: Double = 0.00,
) {
    Row() {
        Text(
            text = name,
            modifier = Modifier
                .padding(all = 4.dp)
                .padding(top = 8.dp)
                .padding(bottom = 8.dp)
                .weight(weight = 1f, fill = true),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = FormatAmount.amount(amount),
            modifier = Modifier
                .padding(all = 4.dp)
                .padding(top = 8.dp)
                .padding(bottom = 8.dp),
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
@Preview
fun PreviewTextViewContextHeaderWithAmount() {
    TextViewContextHeaderWithAmount("Savings", 100.00)
}