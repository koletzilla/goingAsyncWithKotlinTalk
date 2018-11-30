package com.door4c.goingAsync.client.callbacks

import com.door4c.goingAsync.client.common.buildPage
import com.door4c.goingAsync.client.common.timeMeasurement

fun main() {
    timeMeasurement {
        getSession { session ->
            getUserInfo(session) { userInfo ->
                val friends = getFriends(userInfo)
                val photos = getPhotos(userInfo)
                val news = getNews(userInfo)
                println(buildPage(friends, photos, news))
            }
        }
    }
}