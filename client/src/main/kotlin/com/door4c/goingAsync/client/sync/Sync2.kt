package com.door4c.goingAsync.client.sync

import com.door4c.goingAsync.client.common.*

fun main() {
    timeMeasurement {
        val session = getSession()
        val userInfo = getUserInfo(session)

        val friends = getFriends(userInfo)
        val photos = getPhotos(userInfo)
        val news = getNews(userInfo)

        println(
            buildPage(friends, photos, news)
        )
    }
}
