package com.flexphd.foodprophet.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import com.dmj.moneytool.ui.components.BottomNavigationTab

open class BottomNavigationItems {
    companion object {
        val tabs = listOf(
            BottomNavigationTab(Screen.HomeScreen.route, "Accounts", Icons.Filled.Home),
            BottomNavigationTab(Screen.HomeScreen.route, "Entries", Icons.Filled.Search),
            BottomNavigationTab(
                Screen.HomeScreen.route,
                "Settings",
                Icons.Filled.Person
            ),
        )
    }
}