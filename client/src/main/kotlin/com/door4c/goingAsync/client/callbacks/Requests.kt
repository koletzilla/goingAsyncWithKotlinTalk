package com.door4c.goingAsync.client.callbacks

import com.door4c.goingAsync.client.common.*

fun getSession(callback: (session: Session) -> Unit): Session {
    val fakeSession = Session()
    simpleRequest(500, fakeSession.name)
    callback(fakeSession)
    return fakeSession
}

@Suppress("UNUSED_PARAMETER")
fun getUserInfo(session: Session, callback: (userInfo: UserInfo) -> Unit): UserInfo {
    val fakeUserInfo = UserInfo()
    simpleRequest(500, fakeUserInfo.name)
    callback(fakeUserInfo)
    return fakeUserInfo
}

@Suppress("UNUSED_PARAMETER")
fun getFriends(userInfo: UserInfo): Friends {
    val fakeFriends = Friends()
    simpleRequest(500, fakeFriends.name)
    return fakeFriends
}

@Suppress("UNUSED_PARAMETER")
fun getPhotos(userInfo: UserInfo): Photos {
    val fakePhotos = Photos()
    simpleRequest(500, fakePhotos.name)
    return fakePhotos
}

@Suppress("UNUSED_PARAMETER")
fun getNews(userInfo: UserInfo): News {
    val fakeNews = News()
    simpleRequest(500, fakeNews.name)
    return fakeNews
}
