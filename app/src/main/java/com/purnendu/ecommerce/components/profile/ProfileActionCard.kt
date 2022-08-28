package com.purnendu.ecommerce.components.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.purnendu.ecommerce.CornerRadius
import com.purnendu.ecommerce.R

@Composable
fun ProfileActionCard(modifier: Modifier = Modifier, actionName: String) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(CornerRadius),
        elevation =0.dp
    ) {

        Row(
            modifier=Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(text = actionName, fontWeight = FontWeight.Bold)

            Icon(
                painter = painterResource(id = R.drawable.arrow_forward_ios),
                tint = Color.Black,
                contentDescription = "leftArrow"
            )

        }


    }


}