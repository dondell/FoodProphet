package com.flexphd.foodprophet.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.dmj.moneytool.presentation.util.FormatAmount
import com.dmj.moneytool.ui.components.CardView
import com.flexphd.foodprophet.presenter.home.randomColors

@Composable
fun TextViewContextHeaderWithAmountWithExpandable(
    name: String = "",
    amount: Double = 0.00,
    accountsByGroup: List<Any>?,
    navHostController: NavHostController?,
) {
    var isExpand by remember {
        mutableStateOf(false)
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            isExpand = !isExpand
        }) {
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
            Icon(
                imageVector = if (isExpand) Icons.Default.ArrowDropUp else Icons.Default.ArrowDropDown,
                contentDescription = "Expand",
                modifier = Modifier
                    .fillMaxHeight()
                    .align(alignment = Alignment.CenterVertically)
            )
        }

        if (accountsByGroup != null && isExpand) {
            for (accountIndex in accountsByGroup) {

                CardView(
                    modifier = Modifier
                        .padding(2.dp)
                        .fillMaxWidth(),
                    "",
                    Color(randomColors.getColorRow()),
                    onNavigateAddEditAccountScreen = {
                        navHostController?.navigate(Screen.HomeScreen.route)
                    },
                    amount = 0.00
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    TextViewContextHeaderWithAmountWithExpandable(
        "",
        0.00,
        null,
        null
    )
}