package com.purnendu.ecommerce.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Product(modifier: Modifier=Modifier,navController: NavController) {

    val tabs = listOf(
        TabItems.Electronics(navController),
        TabItems.Books(navController),
        TabItems.Grocery(navController),
        TabItems.LifeStyle(navController)
    )

    val pagerState = rememberPagerState()

        Column(modifier = modifier
        ) {
            Tabs(tabs = tabs, pagerState = pagerState)
            Spacer(modifier = Modifier.height(50.dp))
            TabsContent(tabs = tabs, pagerState = pagerState)
        }


}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs: List<TabItems>, pagerState: PagerState) {

    val scope = rememberCoroutineScope()
    // OR ScrollableTabRow()
    ScrollableTabRow(
        edgePadding=0.dp,
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color(229,229,229),
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                color = Color.Blue
            )
        },
    divider = {}) {
        tabs.forEachIndexed { index, tab ->
            Tab(selected = pagerState.currentPage == index,
                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Gray,
                text = { Text(text = tab.title, maxLines = 1, fontSize = 13.sp) },
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                })
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsContent(tabs: List<TabItems>, pagerState: PagerState) {
    HorizontalPager(state = pagerState, count = tabs.size) { page ->
        tabs[page].screen()
    }
}