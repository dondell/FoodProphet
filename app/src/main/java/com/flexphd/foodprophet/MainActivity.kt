package com.flexphd.foodprophet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.flexphd.foodprophet.core.Navigation
import com.flexphd.foodprophet.ui.components.Screen
import com.flexphd.foodprophet.ui.theme.FoodProphetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation(startDestination = Screen.HomeScreen.route)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodProphetTheme {
        Greeting("Android")
    }
}