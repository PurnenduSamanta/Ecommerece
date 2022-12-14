package com.purnendu.ecommerce.screens.homescreen.tabs


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.purnendu.ecommerce.R
import com.purnendu.ecommerce.components.home.SingleProductItem
import com.purnendu.ecommerce.model.Product
import com.purnendu.ecommerce.ui.theme.backgroundColor

private val productsList = listOf(
    Product(R.drawable.watch1, "Apple Watch", "Series 6. Red", "18k"),
    Product(R.drawable.one_plus,"One Plus 3T", "128gb. Black", "28k"),
    Product(R.drawable.oppo_earphone, "Oppo wireless", "M31. Black", "1.5k"),
    Product(R.drawable.msi, "MSI Laptop", "Gf 63. Black", "60k"),
)

@Composable
fun ElectronicsScreen(navController: NavController) {

    LazyRow(modifier = Modifier
        .background(backgroundColor))
    {
        items(productsList)
        { singleProduct ->
            SingleProductItem(modifier = Modifier
                .padding(end = 20.dp)
                .clickable {
                    navController.navigate("product_screen")
                },
                product = singleProduct)
        }
    }
}
