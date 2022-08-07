package com.purnendu.ecommerce.dataclass

import androidx.annotation.DrawableRes

data class Product(@DrawableRes val image:Int, val name:String, val desc:String, val price:String)
