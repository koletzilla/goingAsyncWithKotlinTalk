package com.door4c.goingAsync.client.rxjava

import com.door4c.goingAsync.client.common.*
import io.reactivex.schedulers.Schedulers

fun main() {
    timeMeasurement {
        val session = getSession()
            .subscribeOn(Schedulers.io())
            .blockingFirst()
        println(session)
    }
}
