package com.purnendu.ecommerce.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BooksScreen() {
    Box(
        modifier= Modifier .background(color = Color(229,229,229)),
        contentAlignment = Alignment.Center) {
        Text(text = "Books")
    }
}