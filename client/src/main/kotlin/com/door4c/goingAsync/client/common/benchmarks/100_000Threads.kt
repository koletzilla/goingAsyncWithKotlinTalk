package com.door4c.goingAsync.client.common.benchmarks

import com.door4c.goingAsync.client.common.timeMeasurement
import kotlin.concurrent.thread

/**
 * WARNING: It will take some time to complete
 */
fun main(args: Array<String>) {
    timeMeasurement {
        val jobs = List(100_000) {
            thread {
                Thread.sleep(1000L)
                print(".")
            }
        }
        jobs.forEach { it.join() }
    }
    print("finished")
}
