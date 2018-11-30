package com.door4c.goingAsync.client.completableFutures

import com.door4c.goingAsync.client.common.*

fun main() {
    timeMeasurement {
        val session = getSession().join()
        val userInfo = getUserInfo(session).join()

        val friends = getFriends(userInfo)
        val photos = getPhotos(userInfo)
        val news = getNews(userInfo)

        println(
            buildPage(
                friends.join(),
                photos.join(),
                news.join()
            )
        )
    }
    println("Final line reached")
}
