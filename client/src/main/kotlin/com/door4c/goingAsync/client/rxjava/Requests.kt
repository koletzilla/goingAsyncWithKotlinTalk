package com.door4c.goingAsync.client.rxjava

import com.door4c.goingAsync.client.common.*
import io.reactivex.Observable

fun getSession(): Observable<Session> {
    return Observable.fromCallable {
        val fakeSession = Session()
        simpleRequest(500, fakeSession.name)
        fakeSession
    }
}

@Suppress("UNUSED_PARAMETER")
fun getUserInfo(session: Session): Observable<UserInfo> {
    return Observable.fromCallable {
        val fakeUserInfo = UserInfo()
        simpleRequest(500, fakeUserInfo.name)
        fakeUserInfo
    }
}

@Suppress("UNUSED_PARAMETER")
fun getFriends(userInfo: UserInfo): Observable<Friends> {
    return Observable.fromCallable {
        val fakeFriends = Friends()
        simpleRequest(500, fakeFriends.name)
        fakeFriends
    }
}

@Suppress("UNUSED_PARAMETER")
fun getPhotos(userInfo: UserInfo): Observable<Photos> {
    return Observable.fromCallable {
        val fakePhotos = Photos()
        simpleRequest(500, fakePhotos.name)
        fakePhotos
    }
}

@Suppress("UNUSED_PARAMETER")
fun getNews(userInfo: UserInfo): Observable<News> {
    return Observable.fromCallable {
        val fakeNews = News()
        simpleRequest(500, fakeNews.name)
        fakeNews
    }
}
