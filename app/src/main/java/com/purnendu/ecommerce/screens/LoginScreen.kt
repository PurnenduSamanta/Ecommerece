package com.purnendu.ecommerce.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import com.purnendu.ecommerce.components.login.InputTextField
import com.purnendu.ecommerce.ui.theme.amazingBlue


@Composable
fun LoginScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = amazingBlue)
    ) {

        Column(
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Icon(
                painter = painterResource(id = R.drawable.ic_ellipse),
                contentDescription = "icon",
                modifier = Modifier
                    .padding(start = 30.dp)
                    .size(20.dp)
                    .align(Alignment.Start),
                tint = Color(112, 110, 253)
            )

            Text(
                text = "Welcome\nback", maxLines = 2, textAlign = TextAlign.Start,
                fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White,
                letterSpacing = 2.sp
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_ellipse),
                contentDescription = "icon",
                modifier = Modifier
                    .padding(end = 30.dp)
                    .size(30.dp)
                    .align(Alignment.End),
                //.padding(start = 20.dp, top = 5.dp),
                tint = Color(112, 110, 253)
            )

        }




        Card(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxHeight(0.6f),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {

                Text(text = "Login", color = Color.Black)

                InputTextField(
                    modifier = Modifier.padding(top = 10.dp),
                    icon = painterResource(id = R.drawable.ic_message),
                    labelText = "Email"
                )
                {

                }

                InputTextField(
                    modifier = Modifier.padding(top = 10.dp),
                    icon = painterResource(id = R.drawable.ic_lock),
                    labelText = "Password",
                    isPasswordField = true
                )
                {

                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Forgot Passcode?", color = amazingBlue, fontSize = 12.sp)

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = amazingBlue
                    ),
                    onClick = {

                        navController.navigate("home_screen")

                    }) {

                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Login", color = Color.White, fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 5.dp),
                    text = "Create Account", color = amazingBlue, fontSize = 12.sp
                )

            }


        }


    }

}