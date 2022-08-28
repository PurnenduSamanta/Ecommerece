package com.purnendu.ecommerce.screens.homescreen


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.purnendu.ecommerce.screens.SingleProductScreen


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
  //  navController: NavController
) {

    val navController = rememberNavController()
        Navigation(navController = navController , modifier = modifier)

}

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier = Modifier) {

    NavHost(navController = navController, startDestination = "home_landing")
    {
        composable("home_landing")
        {
            HomeLandingScreen(modifier = modifier, navController = navController)
        }

        composable(route = "product_screen")
        {
            SingleProductScreen(modifier = modifier, navController = navController)
        }
    }
}