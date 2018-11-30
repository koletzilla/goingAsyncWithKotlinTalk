package com.door4c.goingAsync.client.coroutines

import com.door4c.goingAsync.client.common.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun getSession(): Session {
    return withContext(Dispatchers.IO) {
        val fakeSession = Session()
        simpleRequest(500, fakeSession.name)
        fakeSession
    }
}

@Suppress("UNUSED_PARAMETER")
suspend fun getUserInfo(session: Session): UserInfo {
    return withContext(Dispatchers.IO) {
        val fakeUserInfo = UserInfo()
        simpleRequest(500, fakeUserInfo.name)
        fakeUserInfo
    }
}

@Suppress("UNUSED_PARAMETER")
suspend fun getFriends(userInfo: UserInfo): Friends {
    return withContext(Dispatchers.IO) {
        val fakeFriends = Friends()
        simpleRequest(500, fakeFriends.name)
        fakeFriends
    }
}

@Suppress("UNUSED_PARAMETER")
suspend fun getPhotos(userInfo: UserInfo): Photos {
    return withContext(Dispatchers.IO) {
        val fakePhotos = Photos()
        simpleRequest(500, fakePhotos.name)
        fakePhotos
    }
}

@Suppress("UNUSED_PARAMETER")
suspend fun getNews(userInfo: UserInfo): News {
    return withContext(Dispatchers.IO) {
        val fakeNews = News()
        simpleRequest(500, fakeNews.name)
        fakeNews
    }
}
