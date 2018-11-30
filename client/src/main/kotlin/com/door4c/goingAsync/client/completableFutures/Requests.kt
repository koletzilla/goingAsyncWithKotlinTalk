package com.door4c.goingAsync.client.completableFutures

import com.door4c.goingAsync.client.common.*
import java.util.concurrent.CompletableFuture


fun getSession(): CompletableFuture<Session> {
    val fakeSession = Session()
    return CompletableFuture.supplyAsync {
        simpleRequest(500, fakeSession.name)
        fakeSession
    }
}

@Suppress("UNUSED_PARAMETER")
fun getUserInfo(session: Session): CompletableFuture<UserInfo> {
    val fakeUserInfo = UserInfo()
    return CompletableFuture.supplyAsync {
        simpleRequest(500, fakeUserInfo.name)
        fakeUserInfo
    }
}

@Suppress("UNUSED_PARAMETER")
fun getFriends(userInfo: UserInfo): CompletableFuture<Friends> {
    val fakeFriends = Friends()
    return CompletableFuture.supplyAsync {
        simpleRequest(500, fakeFriends.name)
        fakeFriends
    }
}

@Suppress("UNUSED_PARAMETER")
fun getPhotos(userInfo: UserInfo): CompletableFuture<Photos> {
    val fakePhotos = Photos()
    return CompletableFuture.supplyAsync {
        simpleRequest(500, fakePhotos.name)
        fakePhotos
    }
}

@Suppress("UNUSED_PARAMETER")
fun getNews(userInfo: UserInfo): CompletableFuture<News> {
    val fakeNews = News()
    return CompletableFuture.supplyAsync {
        simpleRequest(500, fakeNews.name)
        fakeNews
    }
}
