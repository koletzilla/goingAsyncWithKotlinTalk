package com.door4c.goingAsync.client.completableFutures

import com.door4c.goingAsync.client.common.*

fun main() {
    timeMeasurement {
        val session = getSession().join()
        val userInfo = getUserInfo(session).join()

        val friends = getFriends(userInfo).join()
        val photos = getPhotos(userInfo).join()
        val news = getNews(userInfo).join()

        println(buildPage(friends, photos, news))
    }
    println("Final line reached")
}
