package com.door4c.goingAsync.client.rxjava

import com.door4c.goingAsync.client.common.*

fun main() {
    timeMeasurement {
        getSession().subscribe {
            println(it)
        }
        getSession().subscribe {
            println(it)
        }
        getSession().subscribe {
            println(it)
        }
    }
}
