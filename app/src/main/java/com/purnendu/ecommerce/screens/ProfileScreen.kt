package com.purnendu.ecommerce.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.purnendu.ecommerce.ScreenPaddingValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.components.profile.ProfileActionCard
import com.purnendu.ecommerce.components.profile.ProfileDetailsCard

@Composable
fun ProfileScreen(modifier: Modifier = Modifier, navController: NavController) {


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(ScreenPaddingValue.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.1f), horizontalArrangement = Arrangement.SpaceBetween) {

            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                tint = Color.Black,
                contentDescription = "leftArrow"
            )
            Box(modifier = Modifier.size(10.dp)) {

            }
        }

        Column(
            modifier=Modifier
                .fillMaxWidth()
                .weight(0.9f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {


            Text(
                modifier = Modifier.align(Start),
                text = "My Profile", fontSize = 30.sp, fontWeight = FontWeight.Bold
            )


            ProfileDetailsCard(
                modifier = Modifier.fillMaxWidth(),
                userName = "Purnendu Samanta", address = "43 Oxford Road M13 4GR Manchester, UK"
            )

            ProfileActionCard(
                modifier = Modifier.fillMaxWidth(),
                actionName = "Edit Profile"
            )

            ProfileActionCard(
                modifier = Modifier.fillMaxWidth(),
                actionName = "Shopping address"
            )

            ProfileActionCard(
                modifier = Modifier.fillMaxWidth(),
                actionName = "Order history"
            )

            ProfileActionCard(
                modifier = Modifier.fillMaxWidth(),
                actionName = "Cards"
            )

            ProfileActionCard(
                modifier = Modifier.fillMaxWidth(),
                actionName = "Notifications"
            )


        }
    }





}