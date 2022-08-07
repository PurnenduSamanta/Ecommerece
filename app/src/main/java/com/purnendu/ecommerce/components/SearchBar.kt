package com.purnendu.ecommerce.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.purnendu.ecommerce.R

@Composable
fun SearchBar(modifier: Modifier = Modifier) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(25.dp),
        border = BorderStroke(1.dp,Color.Gray)
    ) {

        Row(modifier = Modifier.padding(10.dp))
        {

            Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = "Search")

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Search", color = Color.Gray)

        }

    }


}