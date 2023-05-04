package com.dmj.moneytool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dmj.moneytool.presentation.util.FormatAmount
import com.flexphd.foodprophet.ui.theme.LightGray
import com.flexphd.foodprophet.ui.theme.Red
import com.flexphd.foodprophet.ui.theme.White

@Composable
fun TextViewDateHeader(
    day: String = "Mon",
    dayString: String? = "",
    monthYear: String? = "",
    credit: Double,
    debit: Double,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = White)
    ) {
        Divider(
            Modifier
                .fillMaxWidth()
                .height(1.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .padding(end = 4.dp)
                    .padding(top = 2.dp)
                    .padding(bottom = 2.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = LightGray)
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .padding(end = 4.dp)
                        .padding(top = 2.dp)
                        .padding(bottom = 2.dp),
                    color = Color.Black,
                    fontSize = 22.sp, fontWeight = FontWeight.Bold,
                    text = day,
                )
            }
            Text(
                text = dayString!!,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .padding(end = 4.dp)
                    .padding(top = 8.dp)
                    .padding(bottom = 8.dp),
                color = Color.Black,
                fontSize = 17.sp, fontWeight = FontWeight.Bold
            )
            Text(
                text = monthYear!!,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .padding(end = 4.dp)
                    .padding(top = 8.dp)
                    .padding(bottom = 8.dp),
                color = Color.Black,
                fontSize = 17.sp, fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
                    .padding(top = 8.dp)
                    .padding(bottom = 8.dp),
                text = FormatAmount.amount(
                    credit
                ),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.End, fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
                    .padding(top = 8.dp)
                    .padding(bottom = 8.dp),
                text = FormatAmount.amount(
                    debit
                ),
                style = MaterialTheme.typography.body1,
                color = Red,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.End, fontWeight = FontWeight.Bold
            )
        }
        Divider(
            Modifier
                .fillMaxWidth()
                .height(1.dp), color = Color.Gray
        )
        Spacer(modifier = Modifier.height(1.dp))
    }
}

@Composable
@Preview
fun PreviewTextViewDateHeader() {
    TextViewDateHeader("07", "Tue", "2023", 100.00, 1.00)
}