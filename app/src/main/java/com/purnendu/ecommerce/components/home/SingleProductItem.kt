package com.purnendu.ecommerce.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.purnendu.ecommerce.model.Product

@Composable
fun SingleProductItem(modifier: Modifier=Modifier, product:Product) {

    Box(modifier = modifier .background(color = Color(229,229,229))) {
        Card(
            modifier = Modifier
                .padding(top =50.dp)
            ,
            elevation = 5.dp,
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier=Modifier
                    .padding(start = 15.dp, end = 15.dp, bottom = 20.dp,top=50.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = product.name,
                    color = Color.Black,
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = product.desc,
                    color = Color.Gray,
                    fontSize = 12.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "${product.price} rs",
                    color = Color.Blue,
                    fontSize = 12.sp
                )
            }


        }

        Image(
            painter = painterResource(id = product.image),
            contentDescription = "avatar",
           // contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .size(90.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clip(CircleShape)
        )


    }
}