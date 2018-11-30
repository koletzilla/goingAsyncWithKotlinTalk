package com.door4c.goingAsync.client.common

import kotlin.system.measureTimeMillis

fun timeMeasurement(block: () -> Unit) {
    val millisMeasured = measureTimeMillis {
        block()
    }
    println("Time required to process this block: $millisMeasured")
}
