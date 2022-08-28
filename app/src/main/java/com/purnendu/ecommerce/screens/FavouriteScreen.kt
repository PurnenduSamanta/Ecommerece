package com.purnendu.ecommerce.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
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
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.ScreenPaddingValue

@Composable
fun FavouriteScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(ScreenPaddingValue.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = "leftArrow"
            )

            Text(
                text = "Favourites", fontWeight = FontWeight.Bold
            )

            Box {}

        }

        Image(
            modifier = Modifier.size(300.dp),
            painter = painterResource(id = R.drawable.favourite_item_icon),
            contentDescription = "No favourite"
        )


        Text(text = "No favourites yet", fontWeight = FontWeight.Bold, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Hit the orange button down\n" +
                    "below to Create an order", fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth(0.5f),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(88, 192, 234)),
            contentPadding = PaddingValues(10.dp),
            onClick = { }) {

            Text(text = "Start ordering", color = Color.White, fontWeight = FontWeight.Bold)

        }


    }
}