package com.flexphd.foodprophet.presenter.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.flexphd.foodprophet.util.RandomColors
import com.dmj.moneytool.ui.components.BottomNavigationBar
import com.flexphd.foodprophet.ui.components.BottomNavigationItems
import com.flexphd.foodprophet.ui.components.TopBarView
import com.flexphd.foodprophet.ui.theme.FoodProphetTheme

val randomColors: RandomColors
    get() {
        return RandomColors()
    }


@Composable
fun HomeScreen(
    onNavigateBack: () -> Unit,
    navHostController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val scrollState = rememberScrollState()


    FoodProphetTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            Scaffold(
                topBar = {
                    TopAppBar {
                        TopBarView(
                            title = "",
                            onNavigateBack = onNavigateBack,
                            showBackButton = false,
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {
                        }, backgroundColor = MaterialTheme.colors.primary
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Edit")
                    }
                },
                bottomBar = {
                    BottomNavigationBar(
                        navController = navHostController,
                        tabs = BottomNavigationItems.tabs
                    )
                }
            ) { contentPadding ->
                Box(modifier = Modifier.padding(contentPadding))
                LazyColumn(
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 10.dp)
                        .background(color = MaterialTheme.colors.background)
                ) {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxHeight(fraction = 8.1f)
                                .background(color = Color.White)
                                .padding(bottom = 10.dp)
                        ) {

                        }
                    }
                    item {
                        Spacer(modifier = Modifier.height(120.dp))
                    }
                }
            }
        }
    }
}