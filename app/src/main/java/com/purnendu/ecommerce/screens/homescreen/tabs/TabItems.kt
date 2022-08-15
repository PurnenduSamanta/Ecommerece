package com.purnendu.ecommerce.screens.homescreen.tabs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

typealias ComposableFun = @Composable () -> Unit

sealed class TabItems(var title: String, var screen: ComposableFun) {
    class Electronics(navController: NavController) :
        TabItems("Electronics", { ElectronicsScreen(navController) })
    class Books(navController: NavController) : TabItems("Books", { ElectronicsScreen(navController) })
    class Grocery(navController: NavController) : TabItems("Grocery", { ElectronicsScreen(navController) })
    class LifeStyle(navController: NavController) : TabItems("LifeStyle", { ElectronicsScreen(navController) })
}
