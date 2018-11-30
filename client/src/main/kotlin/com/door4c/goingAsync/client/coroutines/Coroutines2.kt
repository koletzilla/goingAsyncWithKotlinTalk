package com.door4c.goingAsync.client.coroutines

import com.door4c.goingAsync.client.common.buildPage

import kotlinx.coroutines.*

fun main() = runBlocking {
    timeMeasurementCoroutine {
        val session = getSession()
        val userInfo = getUserInfo(session)

        val friends = async { getFriends(userInfo) }
        val photos = async { getPhotos(userInfo) }
        val news = async { getNews(userInfo) }

        println(
            buildPage(
                friends.await(), photos.await(), news.await()
            )
        )
    }
}
