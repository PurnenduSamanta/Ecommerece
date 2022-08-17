package com.purnendu.ecommerce.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.ScreenPaddingValue
import com.purnendu.ecommerce.components.home.ProductsShowingPart
import com.purnendu.ecommerce.components.home.SearchBar
import com.purnendu.ecommerce.ui.theme.backgroundColor


@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {


    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { padding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(backgroundColor)
                    .padding(ScreenPaddingValue.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        modifier = Modifier.weight(0.1f),
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "Menu"
                    )

                    Spacer(modifier = Modifier.weight(0.05f))

                    SearchBar(modifier = Modifier.weight(0.8f, true))

                }


                Text(
                    text = "Welcome\nPurnendu Samanta",
                    color = Color.Black,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Column(modifier = Modifier.fillMaxWidth()) {

                    ProductsShowingPart(navController = navController)

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_arrow),
                            contentDescription = "Arrow"
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "see more", color = Color.Blue)
                    }
                }


            }

        }


    }


}