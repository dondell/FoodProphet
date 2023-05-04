package com.dmj.moneytool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dmj.moneytool.presentation.util.FormatAmount

@Composable()
fun CardView(
    modifier: Modifier = Modifier,
    title: String = "Title",
    color: Color,
    isLastItem: Boolean = false,
    onNavigateAddEditAccountScreen: () -> Unit,
    withAmount: Boolean = true,
    amount: Double = 0.00,
) {
    Column(
        modifier = modifier
            .size(width = 70.dp, height = 50.dp)
            .background(color, RoundedCornerShape(10.dp))
            .border(
                if (!isLastItem) 2.dp else 0.dp,
                if (!isLastItem) Color.Transparent else Color.Black,
                shape = RoundedCornerShape(8.dp),
            )
            .clickable(onClick = onNavigateAddEditAccountScreen),
        //.border(BorderStroke(if (!isLastItem) 2.dp else 0.dp, Color.Black)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Text(
                text = title, modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 6.dp)
                    .weight(weight = 1f, fill = true),
                color = if (!isLastItem) Color.Black else Color.Black,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
            if (withAmount) {
                Text(
                    text = FormatAmount.amount(amount),
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .padding(top = 8.dp)
                        .padding(bottom = 8.dp)
                        .padding(end = 5.dp),
                    color = Color.Black,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
@Preview
fun PreviewCardView() {
    CardView(modifier = Modifier.fillMaxWidth(),
        "Sample Text",
        color = Color.White,
        false,
        {})
}
