package com.door4c.goingAsync.client.common

import java.io.IOException
import java.net.URL

fun simpleRequest(millisecondsToWait: Int, name: String) {
    try {
        val result = URL("http://localhost:8080/delay/$millisecondsToWait/$name")
            .openStream()
            .bufferedReader()
            .use { it.readText() }

        println(result)
    } catch (e: IOException) {
        "Error with ${e.message}."
    }
}
