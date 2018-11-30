package com.door4c.goingAsync.client.sync

import com.door4c.goingAsync.client.common.timeMeasurement

fun main() {
    timeMeasurement {
        val session = getSession()
        val userInfo = getUserInfo(session)
        println(
            getFriends(userInfo)
        )
    }
}
