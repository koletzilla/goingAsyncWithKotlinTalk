package com.door4c.goingAsync.client.completableFutures

import com.door4c.goingAsync.client.common.*
import java.util.concurrent.CompletableFuture

fun main() {
    lateinit var builtPage: CompletableFuture<String>
    timeMeasurement {
        builtPage = getSession()
            .thenCompose { session ->
                getUserInfo(session)
            }.thenApply { userInfo ->
                val friends = getFriends(userInfo)
                val photos = getPhotos(userInfo)
                val news = getNews(userInfo)
                buildPage(
                    friends.join(),
                    photos.join(),
                    news.join()
                )
            }
        println("Final line reached")
    }
    println(builtPage.join())
}
