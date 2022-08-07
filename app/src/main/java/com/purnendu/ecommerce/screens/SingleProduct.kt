package com.purnendu.ecommerce.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.components.ColorChooserBox

@Composable
fun SingleProduct() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(229, 229, 229))
            .padding(top = 30.dp)
    ) {

        Column(
            Modifier
                .fillMaxWidth()
                .weight(0.4f)
                .padding(horizontal = 20.dp)
                .background(color = Color(229, 229, 229)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow___left),
                    contentDescription = "leftArrow"
                )

                Icon(
                    painter = painterResource(id = R.drawable.ic_heart),
                    contentDescription = "wishlist"
                )

            }

            Image(
                modifier = Modifier
                    .fillMaxHeight(0.8f)
                    .fillMaxWidth(0.5f)
                   // .size(120.dp)
                    .background(color = Color(229, 229, 229)),
                painter = painterResource(id = R.drawable.ipad),
                contentDescription = "item pic",
            )

            Spacer(modifier = Modifier.height(10.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_dot_group),
                contentDescription = "dotGroup"
            )


        }



        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.6f),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 30.dp),
                verticalArrangement = Arrangement.SpaceBetween
            )
            {

                Column {
                    Text(text = "2020 Apple iPad Air 10.9\"", fontWeight = FontWeight.Bold)

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Colors", fontSize = 12.sp)

                    Spacer(modifier = Modifier.height(5.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ColorChooserBox(color = Color.Green, colorName = "Green")
                        ColorChooserBox(color = Color.Cyan, colorName = "Cyan")
                        ColorChooserBox(color = Color.Gray, colorName = "Grey")
                    }


                }

                Column {

                    Text(text = "Get Apple TV+ free for a year", fontSize = 12.sp)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Available when you purchase any new iPhone, iPad, iPod Touch, Mac or Apple TV, £4.99/month after free trial.",
                        fontSize = 10.sp, color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Full description", color = Color.Blue, fontSize = 12.sp)
                        Spacer(modifier = Modifier.width(5.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_arrow),
                            contentDescription = "Arrow"
                        )
                    }
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total", fontSize = 12.sp)

                        Text(text = "20k", color = Color.Blue, fontSize = 12.sp)

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                        contentPadding = PaddingValues(15.dp),
                        onClick = { }) {

                        Text(text = "Add to basket", color = Color.White, fontWeight = FontWeight.Bold)

                    }

                }


            }

        }

    }
}