package com.flexphd.foodprophet.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.dmj.moneytool.ui.components.SampleStringProvider
import com.flexphd.foodprophet.R
import com.flexphd.foodprophet.ui.theme.NatureGreen
import com.flexphd.foodprophet.ui.theme.White

@Composable
fun TopBarView(
    onNavigateBack: () -> Unit,
    showBackButton: Boolean,
    hasSearch: Boolean? = false,
    @PreviewParameter(SampleStringProvider::class) title: String = "Top App Bar",
) {
    val isClickOnSearch = false

    if (!isClickOnSearch) {
        TopAppBar(
            title = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = title,
                        modifier = Modifier
                            .weight(1f)
                            .align(Alignment.CenterVertically),
                        textAlign = TextAlign.Left
                    )
                    if (hasSearch == true) {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "",
                            modifier = Modifier
                                .padding(15.dp)
                                .size(24.dp)
                                .clickable {
                                },
                            tint = White
                        )
                    }
                }
            },
            navigationIcon = {
                if (showBackButton) {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                } else {
                    IconButton(onClick = onNavigateBack) {
                        Image(
                            painterResource(R.drawable.ic_launcher_background),
                            contentDescription = "",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(all = 3.dp)
                        )
                    }
                    /*IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, "menuIcon")
                    }*/
                }
            },
            backgroundColor = NatureGreen,
            contentColor = Color.White,
            elevation = 10.dp
        )
    }
}

@Composable
@Preview
fun TopBarPreview() {
    TopBarView(
        {},
        showBackButton = false,
        true,
        "Food Prophet",
    )
}
