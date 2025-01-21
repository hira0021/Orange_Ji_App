package com.example.orange_ji.domain.model

data class PostItem(
    val name: String,
    val content: String,
    val postType: Int,
    val isLike: Int
)

object PostItemDummyData {
    val itemList = listOf(
        PostItem(
            "Alice",
            "Alice loves to explore new places and meet new people. She enjoys photography and capturing moments. " +
                    "In her travels, she has visited various countries, each offering a unique experience. " +
                    "Her passion for adventure drives her to seek out hidden gems and local cultures.",
            0,
            0
        ),
        PostItem(
            "Bob",
            "Bob is a software developer who enjoys writing clean and efficient code. " +
                    "He loves learning new technologies and staying up-to-date with industry trends. " +
                    "In his free time, he contributes to open-source projects and shares his knowledge with others, " +
                    "believing that collaboration can lead to great innovations.",
            0,
            0
        ),
        PostItem(
            "Charlie",
            "Charlie is a travel enthusiast who enjoys writing about his adventures around the world. " +
                    "He believes that traveling broadens one’s perspective and fosters a greater appreciation for diversity. " +
                    "With every journey, he captures beautiful moments through words and pictures, sharing his experiences " +
                    "to inspire others to explore.",
            0,
            0
        ),
        PostItem(
            "David",
            "David loves cooking and often experiments with different cuisines in his kitchen. " +
                    "He believes that food is a universal language that brings people together. " +
                    "Whether it's trying out new recipes or inventing his own, David finds joy in the creative process of cooking. " +
                    "He frequently hosts dinner parties, delighting his friends with culinary creations.",
            0,
            0
        ),
        PostItem(
            "Eve",
            "Eve is an avid reader who spends her weekends diving into different novels and stories. " +
                    "She enjoys losing herself in fictional worlds and exploring the depths of human emotions through literature. " +
                    "Her favorite genres include fantasy, mystery, and historical fiction, each offering a unique escape from reality. " +
                    "Eve also participates in book clubs, where she engages in lively discussions with fellow book lovers.",
            0,
            0
        ),
        PostItem(
            "Frank",
            "Frank is a fitness enthusiast who believes in the power of exercise and healthy living. " +
                    "He enjoys sharing his workout routines and meal plans with friends, motivating them to adopt a healthier lifestyle. " +
                    "On weekends, he often participates in marathons and outdoor activities, embracing the beauty of nature and physical challenges.",
            0,
            0
        ),
        PostItem(
            "Grace",
            "Grace has a passion for art and spends her days painting and creating stunning visual pieces. " +
                    "She finds inspiration in nature and human emotions, often expressing her feelings through vibrant colors. " +
                    "Grace holds art exhibitions to showcase her work and inspire others to appreciate creativity in their lives.",
            0,
            0
        ),
        PostItem(
            "Hannah",
            "Hannah is a tech-savvy individual who loves exploring the latest gadgets and innovations. " +
                    "She enjoys writing reviews and tutorials for new technology, helping others make informed choices. " +
                    "Her curiosity drives her to attend tech conferences and workshops, where she networks with like-minded individuals.",
            0,
            0
        ),
        PostItem(
            "Ian",
            "Ian is a nature lover who finds solace in the great outdoors. He enjoys hiking, camping, and observing wildlife. " +
                    "Through his blog, he shares his adventures, tips on outdoor survival, and the importance of preserving nature. " +
                    "Ian believes that everyone should experience the beauty of nature at least once.",
            0,
            0
        ),
        PostItem(
            "Jasmine",
            "Jasmine is a passionate musician who plays several instruments and loves composing her own songs. " +
                    "She finds joy in sharing her music with friends and performing at local events. " +
                    "Jasmine believes that music has the power to connect people and often collaborates with other artists to create unique sounds.",
            0,
            0
        )
    )

}
