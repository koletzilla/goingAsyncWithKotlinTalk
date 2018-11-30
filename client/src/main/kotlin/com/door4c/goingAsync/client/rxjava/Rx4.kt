package com.door4c.goingAsync.client.rxjava

import com.door4c.goingAsync.client.common.*
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.reactivex.functions.Function3

fun main() {
    lateinit var builtPage: Observable<String>
    timeMeasurement {
        builtPage = getSession()
            .subscribeOn(Schedulers.io())
            .flatMap { session -> getUserInfo(session) }
            .flatMap { userInfo ->
                Observable.zip(
                    getFriends(userInfo).subscribeOn(Schedulers.io()),
                    getPhotos(userInfo).subscribeOn(Schedulers.io()),
                    getNews(userInfo).subscribeOn(Schedulers.io()),
                    Function3 { friends: Friends, photos: Photos, news: News ->
                        buildPage(friends, photos, news)
                    })
            }
    }
    timeMeasurement {
        println(builtPage.blockingFirst())
    }
}
