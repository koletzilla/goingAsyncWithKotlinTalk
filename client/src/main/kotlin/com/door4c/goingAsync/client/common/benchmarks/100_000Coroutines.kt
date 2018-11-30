package com.door4c.goingAsync.client.common.benchmarks

import com.door4c.goingAsync.client.common.timeMeasurement
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    timeMeasurement {
        runBlocking {
            val jobs = List(100_000) {
                launch {
                    delay(1000L)
                    print(".")
                }
            }
            jobs.forEach { it.join() }
        }
    }
    print("finished")
}
