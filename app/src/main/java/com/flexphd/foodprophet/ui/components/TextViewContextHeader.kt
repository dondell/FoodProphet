package com.dmj.moneytool.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun TextViewContextHeader(@PreviewParameter(SampleStringProvider::class) name: String = "List of Accounts") {
    Text(
        text = name, modifier = Modifier
            .fillMaxWidth()
            .padding(all = 4.dp)
            .padding(top = 8.dp)
            .padding(bottom = 8.dp)
        ,
        color = Color.Black,
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold,
    )
}