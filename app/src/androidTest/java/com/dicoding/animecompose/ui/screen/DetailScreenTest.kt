package com.dicoding.animecompose.ui.screen

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.dicoding.animecompose.R
import com.dicoding.animecompose.model.Anime
import com.dicoding.animecompose.ui.screen.detail.DetailInformation
import com.dicoding.animecompose.ui.theme.AnimeTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class DetailScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private val fakeAnimeData = Anime(
        id = 0,
        title = "Sword Art Online",
        synopsis = "In the year 2022, virtual reality has progressed by leaps and bounds, and a massive online role-playing game called Sword Art Online (SAO) is launched. With the aid of 'NerveGear' technology, players can control their avatars within the game using nothing but their own thoughts. However, in a cruel turn of events, the players soon realize they cannot log out; the game's creator has trapped them in his new world until they complete all one hundred levels of the game.",
        image = R.drawable.sword_art_online,
        episodes = "25 Episodes",
        studio = "A-1 Pictures",
        rating = 7.24,
        genre = "Action, Adventure, Fantasy, Game, Romance"
    )

    @Before
    fun setUp() {
        composeTestRule.setContent {
            AnimeTheme {
                DetailInformation(
                    id = fakeAnimeData.id,
                    title = fakeAnimeData.title,
                    studio = fakeAnimeData.studio,
                    image = fakeAnimeData.image,
                    synopsis = fakeAnimeData.synopsis,
                    genre = fakeAnimeData.genre,
                    episodes = fakeAnimeData.episodes,
                    rating = fakeAnimeData.rating,
                    isFavorite = fakeAnimeData.isFavorite,
                    navigateBack = {},
                    onFavoriteButtonClicked = { _, _ -> }
                )
            }
        }
    }

    @Test
    fun detailScreen_isDisplayed() {
        composeTestRule.onNodeWithText(fakeAnimeData.title).assertIsDisplayed()
        composeTestRule.onNodeWithText(fakeAnimeData.studio).assertIsDisplayed()
        composeTestRule.onNodeWithTag("episodes_text").assertIsDisplayed()
        composeTestRule.onNodeWithText(fakeAnimeData.synopsis).assertIsDisplayed()
    }
}