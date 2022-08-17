package com.purnendu.ecommerce.screens


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.screens.homescreen.HomeScreen
import com.purnendu.ecommerce.ui.theme.amazingBlue
import com.purnendu.ecommerce.ui.theme.backgroundColor


@Composable
fun LandingScreen() {
    val navController = rememberNavController()

    Scaffold(

        modifier=Modifier
            .fillMaxSize(),
        backgroundColor = backgroundColor,
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        "Home", "home",
                        Pair(
                            painterResource(id = R.drawable.ic_home),
                            painterResource(id = R.drawable.ic_home_filled)
                        )
                    ),
                    BottomNavItem(
                        "Favourite",
                        "favourite",
                        Pair(
                            painterResource(id = R.drawable.ic_favourite),
                            painterResource(id = R.drawable.ic_favourite_filled)
                        )
                    ),
                    BottomNavItem(
                        "Profile",
                        "profile",
                        Pair(
                            painterResource(id = R.drawable.ic_profile),
                            painterResource(id = R.drawable.ic_profile_filled)
                        )
                    ),
                    BottomNavItem(
                        "Cart",
                        "cart",
                        Pair(
                            painterResource(id = R.drawable.ic_shopping_cart),
                            painterResource(id = R.drawable.ic_shopping_cart_filled)
                        )
                    )
                ),
                navController = navController,
                onItemClick = { navController.navigate(it.route) }
            )
        }
    ) {
        Navigation(navController = navController, modifier = Modifier.padding(it))
    }
}

@Composable
fun Navigation(navController: NavHostController,modifier: Modifier=Modifier) {

    NavHost(navController = navController, startDestination = "home")
    {
        composable("home")
        {
            HomeScreen(modifier=modifier,navController = navController)
        }

        composable("favourite")
        {
            FavouriteScreen(modifier=modifier,navController = navController)

        }

        composable("profile")
        {
            ProfileScreen(modifier=modifier,navController = navController)

        }

        composable("cart")
        {
            CartScreen(modifier=modifier,navController = navController)
        }
    }

}

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        items.forEach {
            val selected = it.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(it) },
                icon = {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        painter = if (selected) it.icon.second
                        else it.icon.first,
                        contentDescription = "icon",
                    )
                },
                selectedContentColor = amazingBlue,
                unselectedContentColor = Color.Black
            )
        }
    }
}

class BottomNavItem(
    val name: String,
    val route: String,
    val icon: Pair<Painter, Painter>,
)