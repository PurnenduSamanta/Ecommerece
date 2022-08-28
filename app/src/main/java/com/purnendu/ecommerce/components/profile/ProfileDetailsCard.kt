package com.purnendu.ecommerce.components.profile


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.purnendu.ecommerce.CornerRadius
import com.purnendu.ecommerce.R


@Composable
fun ProfileDetailsCard(modifier: Modifier = Modifier, userName: String, address: String) {


    Box(modifier = modifier)
    {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            elevation = 0.dp,
            shape = RoundedCornerShape(CornerRadius.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp, bottom = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = userName, fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_location),
                        contentDescription = "location"
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Address: $address", maxLines = 3
                    )

                }


            }


        }

        Image(
            painter = painterResource(id = R.drawable.profile_pic), contentDescription = "Image",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .size(80.dp)
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clip(CircleShape)
        )


    }


}