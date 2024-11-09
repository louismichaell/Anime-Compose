package com.dicoding.animecompose.model

import com.dicoding.animecompose.R

object AnimeData {
    val animeDummy = listOf(
        Anime(
            id = 0,
            title = "Attack on Titan",
            synopsis = "Several hundred years ago, humans were nearly exterminated by Titans. Titans are typically several stories tall, seem to have no intelligence, devour human beings and, worst of all, seem to do it for pleasure rather than as a food source. A small percentage of humanity survived by walling themselves in a city protected by extremely high walls, even taller than the biggest Titans. Flash forward to the present and the city has not seen a Titan in over 100 years. Teenage boy Eren and his foster sister Mikasa witness something horrific as the city walls are destroyed by a Colossal Titan that appears out of thin air. As the smaller Titans flood the city, the two kids watch in horror as their mother is eaten alive. Eren vows that he will murder every single Titan and take revenge for all of mankind.",
            image = R.drawable.attack_on_titan,
            episodes = "75",
            studio = "Wit Studio",
            rating = 8.52,
            genre = "Action, Drama, Fantasy, Military, Mystery, Shounen, Super Power"
        ),
        Anime(
            id = 1,
            title = "One Piece",
            synopsis = "Monkey D. Luffy, a young pirate with the ability to stretch his body like rubber after eating a Devil Fruit, sets sail to find the One Piece, the greatest treasure in the world, and become the Pirate King. On his journey, he gathers a diverse crew of strong and loyal companions, each with their own goals and dreams, and faces powerful enemies as they explore the Grand Line.",
            image = R.drawable.one_piece,
            episodes = "1000+",
            studio = "Toei Animation",
            rating = 8.8,
            genre = "Action, Adventure, Comedy, Fantasy, Shounen"
        ),
        Anime(
            id = 2,
            title = "Death Note",
            synopsis = "A Shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the Shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm. High school student and prodigy Light Yagami stumbles upon the Death Note and—since he deplores the state of the world—tests the deadly notebook by writing a criminal's name in it. When the criminal dies immediately following his experiment with the Death Note, Light is greatly surprised and quickly recognizes how devastating the power that has fallen into his hands could be.",
            image = R.drawable.death_note,
            episodes = "37",
            studio = "Madhouse",
            rating = 8.63,
            genre = "Mystery, Psychological, Supernatural, Thriller"
        ),
        Anime(
            id = 3,
            title = "Steins;Gate",
            synopsis = "The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara, where he indulges in his hobby of inventing prospective 'future gadgets' with fellow lab members: Mayuri Shiina, his air-headed childhood friend, and Hashida Itaru, a perverted hacker nicknamed 'Daru.' The three pass the time by tinkering with their most promising contraption yet, a machine dubbed the 'Phone Microwave,' which performs the strange function of morphing bananas into piles of green gel. Though miraculous in itself, the phenomenon doesn't provide anything concrete in Okabe's search for a scientific breakthrough; that is, until the lab members are spurred into action by a string of mysterious happenings before stumbling upon an unexpected success—the Phone Microwave can send emails to the past, altering the flow of history.",
            image = R.drawable.steins_gate,
            episodes = "24",
            studio = "White Fox",
            rating = 9.10,
            genre = "Sci-Fi, Thriller"
        ),
        Anime(
            id = 4,
            title = "Gintama",
            synopsis = "In an era where samurais are no longer needed, Gintoki Sakata still carries the heart of the samurai. However, Gintoki does not look much like one with his love of sweets and his ability to do whatever it takes to make a quick buck. Accompanied by Shinpachi Shimura, Kagura, and their giant dog Sadaharu, he runs the Yorozuya, a small business that specializes in everything from finding lost kittens to saving the world. The Yorozuya team finds themselves often stuck in ridiculous situations, often leading to the humor and sarcasm that the series is known for.",
            image = R.drawable.gintama,
            episodes = "201",
            studio = "Sunrise",
            rating = 8.95,
            genre = "Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen"
        ),
        Anime(
            id = 5,
            title = "One Punch Man",
            synopsis = "The seemingly ordinary and unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, he trained relentlessly for three years—and lost all of his hair in the process. Now, Saitama is incredibly powerful, so much so that no enemy can defeat him in battle. In fact, all it takes to defeat evildoers with just one punch has led to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.",
            image = R.drawable.one_punch_man,
            episodes = "12",
            studio = "Madhouse",
            rating = 8.54,
            genre = "Action, Comedy, Parody, Super Power, Supernatural, Seinen"
        ),
        Anime(
            id = 6,
            title = "My Hero Academia",
            synopsis = "In a world where nearly everyone possesses a superpower, or 'quirk,' Izuku Midoriya dreams of becoming the world's greatest hero. Unfortunately, he was born quirkless. With the help of his idol, All Might, he is given the chance to attend U.A. High School, a prestigious school known for its 'Hero Course,' where he learns what it takes to become a hero.",
            image = R.drawable.my_hero_academia,
            episodes = "88",
            studio = "Bones",
            rating = 8.06,
            genre = "Action, Comedy, School, Shounen, Super Power"
        ),
        Anime(
            id = 7,
            title = "Naruto: Shippuden",
            synopsis = "Naruto Uzumaki, an adolescent ninja, dreams of becoming the strongest ninja in the village and leader of the Hidden Leaf. Despite the hardships, he continues his journey, facing stronger enemies and growing alongside his comrades. 'Shippuden' is the continuation of the Naruto series, following his adventures after two and a half years of training with Jiraiya.",
            image = R.drawable.naruto_shippuden,
            episodes = "500",
            studio = "Studio Pierrot",
            rating = 8.25,
            genre = "Action, Adventure, Martial Arts, Shounen, Super Power"
        ),
        Anime(
            id = 8,
            title = "Demon Slayer: Kimetsu no Yaiba",
            synopsis = "Since ancient times, rumors have abounded of man-eating demons lurking in the woods. Because of this, the local townsfolk never venture outside at night. Legend has it that a demon slayer also roams the night, hunting down these bloodthirsty demons. For young Tanjiro, these rumors will soon become his harsh reality.",
            image = R.drawable.demon_slayer,
            episodes = "26",
            studio = "Ufotable",
            rating = 8.69,
            genre = "Action, Demons, Historical, Shounen, Supernatural"
        ),
        Anime(
            id = 9,
            title = "Sword Art Online",
            synopsis = "In the year 2022, virtual reality has progressed by leaps and bounds, and a massive online role-playing game called Sword Art Online (SAO) is launched. With the aid of 'NerveGear' technology, players can control their avatars within the game using nothing but their own thoughts. However, in a cruel turn of events, the players soon realize they cannot log out; the game's creator has trapped them in his new world until they complete all one hundred levels of the game.",
            image = R.drawable.sword_art_online,
            episodes = "25",
            studio = "A-1 Pictures",
            rating = 7.24,
            genre = "Action, Adventure, Fantasy, Game, Romance"
        )
    )
}
