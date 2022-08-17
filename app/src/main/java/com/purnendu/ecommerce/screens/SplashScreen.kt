package com.purnendu.ecommerce.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.purnendu.ecommerce.LargeTextSize
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.ScreenPaddingValue
import com.purnendu.ecommerce.ui.theme.amazingBlue

@Composable
fun SplashScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = amazingBlue)
            .padding(ScreenPaddingValue.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Find your\nneeds",
            fontSize = LargeTextSize.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp,
            color = Color.White
        )

        Image(
            painter = painterResource(id = R.drawable.splash_screen_icon),
            contentDescription = "splash screen"
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top=20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            ),
            onClick = {
                navController.navigate("login_screen")

            }) {

            Text(
                modifier = Modifier.padding(5.dp),
                text = "Get Started", color = amazingBlue, fontWeight = FontWeight.Bold
            )
        }

    }

}