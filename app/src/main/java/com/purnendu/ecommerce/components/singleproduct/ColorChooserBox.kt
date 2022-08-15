package com.purnendu.ecommerce.components.singleproduct

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.unit.dp

@Composable
fun ColorChooserBox(color: Color,colorName:String) {

    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp,
        border = BorderStroke(1.dp,Color.Gray)
    ) {

        Row(
            modifier=Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Box(modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .background(color)) {

            }
            
            Spacer(modifier = Modifier.width(10.dp))
            
            Text(text = colorName)

        }



    }

}