package com.purnendu.ecommerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.purnendu.ecommerce.screens.LandingScreen
import com.purnendu.ecommerce.screens.LoginScreen
import com.purnendu.ecommerce.screens.SingleProductScreen
import com.purnendu.ecommerce.screens.SplashScreen
import com.purnendu.ecommerce.ui.theme.EcommerceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navigation()

                }
            }
        }
    }
}


@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen")
    {

        composable(route = "splash_screen")
        {
           SplashScreen(navController)
        }

        composable(route = "login_screen")
        {
            LoginScreen(navController)
        }

        composable(route = "landing_screen")
        {
            LandingScreen()
        }
        composable(route = "product_screen")
        {
            SingleProductScreen()
        }
    }

}