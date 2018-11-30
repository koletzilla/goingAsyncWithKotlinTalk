package com.door4c.goingAsync.client.coroutines

import com.door4c.goingAsync.client.common.buildPage
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    timeMeasurementCoroutine {
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
