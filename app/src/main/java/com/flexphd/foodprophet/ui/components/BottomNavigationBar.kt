package com.dmj.moneytool.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.flexphd.foodprophet.ui.components.Screen
import com.flexphd.foodprophet.ui.theme.LightGray
import com.flexphd.foodprophet.ui.theme.White

@Composable
fun BottomNavigationBar(
    navController: NavHostController?,
    tabs: List<BottomNavigationTab>,
) {
    BottomNavigation(
        modifier = Modifier.fillMaxWidth(),
    ) {
        tabs.forEachIndexed { _, tab ->
            BottomNavigationItem(
                icon = { Icon(tab.icon, contentDescription = null) },
                label = { Text(tab.label) },
                selected = tab.route == navController?.currentDestination?.route,
                onClick = {
                    navController?.navigate(tab.route) {
                        launchSingleTop = true
                    }
                },
                selectedContentColor = White,
                unselectedContentColor = LightGray.copy(alpha = 0.6f)
            )
        }
    }
}

data class BottomNavigationTab(
    val route: String,
    val label: String,
    val icon: ImageVector,
)

@Composable
@Preview
fun PreviewBottomNavigationBar() {
    val tempTabs = listOf(
        BottomNavigationTab(Screen.HomeScreen.route, "Accounts", Icons.Filled.Home),
        BottomNavigationTab(Screen.HomeScreen.route, "Entries", Icons.Filled.Search),
        BottomNavigationTab(
            Screen.HomeScreen.route,
            "Settings",
            Icons.Filled.Person
        ),
    )
    BottomNavigationBar(
        navController = null,
        tabs = tempTabs
    )
}