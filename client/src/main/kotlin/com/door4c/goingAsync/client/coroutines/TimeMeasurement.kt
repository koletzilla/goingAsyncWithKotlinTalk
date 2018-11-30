package com.door4c.goingAsync.client.coroutines

import kotlin.system.measureTimeMillis

suspend fun timeMeasurementCoroutine(block: suspend () -> Unit) {
    val millisMeasured = measureTimeMillis {
        block()
    }
    println("Time required to process this block: $millisMeasured")
}
