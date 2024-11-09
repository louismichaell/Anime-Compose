package com.dicoding.animecompose.ui.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.animecompose.R

@Composable
fun AboutScreen() {
    val image = painterResource(id = R.drawable.profile)
    val name = R.string.name.toString()
    val email = R.string.email.toString()
    val description = "I am Louis Michael, an active student in the 7th semester of the Informatics Engineering Study Program, Atma Luhur Pangkalpinang Institute of Science and Business, joining in 2021. With a love for the world of technology, I have mastered laptop and computer repair skills and other electronics, both in terms of hardware and software. work experience of more than 2 years in the field. And I also mastered beginner mobile development and I am Mobile Development Cohort 2024 at Bangkit Academy led by Google, GoTo, Traveloka then I am also very interested in the business world."

    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = image,
                    contentDescription = "profile_image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = email,
                fontSize = 16.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Divider(modifier = Modifier.padding(horizontal = 0.dp, vertical = 16.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = description,
                fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}