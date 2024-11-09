package com.dicoding.animecompose.ui

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.dicoding.animecompose.AnimeCompose
import com.dicoding.animecompose.ui.navigation.Screen
import com.dicoding.animecompose.ui.theme.AnimeTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import com.dicoding.animecompose.R

class AnimeComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()
    private lateinit var navController: TestNavHostController

    @Before
    fun setUp() {
        composeTestRule.setContent {
            AnimeTheme {
                navController = TestNavHostController(LocalContext.current)
                navController.navigatorProvider.addNavigator(ComposeNavigator())
                AnimeCompose(navController = navController)
            }
        }
    }

    @Test
    fun navHost_StartRoute() {
        navController.assertCurrentRouteName(Screen.Home.route)
    }

    @Test
    fun navHost_bottomNavigation_click() {
        composeTestRule.onNodeWithStringId(R.string.menu_favorite).performClick()
        navController.assertCurrentRouteName(Screen.Favorite.route)
        composeTestRule.onNodeWithStringId(R.string.menu_profile).performClick()
        navController.assertCurrentRouteName(Screen.Profile.route)
        composeTestRule.onNodeWithStringId(R.string.menu_home).performClick()
        navController.assertCurrentRouteName(Screen.Home.route)
    }

    @Test
    fun search_ShowEmptyItem() {
        val incorrectSearch = "Two"
        composeTestRule.onNodeWithStringId(R.string.search).performTextInput(incorrectSearch)
        composeTestRule.onNodeWithTag("emptyItem").assertIsDisplayed()
    }
}