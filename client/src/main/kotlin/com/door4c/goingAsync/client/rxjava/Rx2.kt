package com.door4c.goingAsync.client.rxjava

import com.door4c.goingAsync.client.common.*
import io.reactivex.schedulers.Schedulers

fun main() {
    timeMeasurement {
        getSession()
            .subscribeOn(Schedulers.io())
            .subscribe { println(it) }
        getSession()
            .subscribeOn(Schedulers.io())
            .subscribe { println(it) }
        getSession()
            .subscribeOn(Schedulers.io())
            .subscribe { println(it) }
    }
    Thread.sleep(2000)
}
