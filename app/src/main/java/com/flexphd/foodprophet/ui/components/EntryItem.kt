package com.dmj.moneytool.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dmj.moneytool.presentation.util.DateUtil
import com.dmj.moneytool.presentation.util.FormatAmount
import com.flexphd.foodprophet.ui.theme.Black
import com.flexphd.foodprophet.ui.theme.LightGray

@Composable
fun EntryItem(
    entry: String,
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 10.dp,
    cutCornerSize: Dp = 30.dp,
    onDeleteClick: () -> Unit,
) {
    Box(
        modifier = modifier
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val clipPath = Path().apply {
                lineTo(size.width, 0f)
                lineTo(size.width, cutCornerSize.toPx())
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }
            clipPath(clipPath) {
                drawRoundRect(
                    color = LightGray,
                    size = size,
                    cornerRadius = CornerRadius(cornerRadius.toPx())
                )
                /*drawRoundRect(
                    color = LightGreen,
                    topLeft = Offset(size.width - cutCornerSize.toPx(), -100f),
                    size = Size(cutCornerSize.toPx() + 100f, cutCornerSize.toPx() + 100f),
                    cornerRadius = CornerRadius(cornerRadius.toPx())
                )*/
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                modifier = Modifier
                    .weight(weight = 1f)
                    .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp),
                text = DateUtil.convertLongToTime(234),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp),
                text = "",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp),
                text = "",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 5.dp, top = 10.dp, end = 5.dp, bottom = 5.dp)
                .padding(top = 10.dp)
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
            Text(
                modifier = Modifier.weight(1f),
                text = FormatAmount.amount(0.0),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.End
            )
            Text(
                modifier = Modifier.weight(1f),
                text = FormatAmount.amount(0.00),
                style = MaterialTheme.typography.body1,
                color = Black,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.End
            )
        }
        /*IconButton(
            onClick = onDeleteClick,
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Delete entry",
                tint = LightGreen
            )
        }*/
    }
}