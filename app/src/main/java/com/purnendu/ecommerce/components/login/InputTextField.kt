package com.purnendu.ecommerce.components.login

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.purnendu.ecommerce.ui.theme.amazingBlue


@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    icon: Painter,
    labelText: String,
    isPasswordField: Boolean = false,
    onTextChange: (String) -> Unit
) {

    var text by remember {
        mutableStateOf("")
    }
    TextField(
        modifier = modifier.fillMaxWidth(),
        value = text, onValueChange = {
            text = it
            onTextChange(it)
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Black,
            backgroundColor = Color.White
        ),
        label = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = icon,
                    contentDescription = "field",
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(3.dp))

                Text(labelText, color = Color.Gray, fontSize = 12.sp)
            }
        },
        trailingIcon = {
            if (isPasswordField) Text(text = "Show", color = amazingBlue, fontSize = 12.sp)
        }
    )
}