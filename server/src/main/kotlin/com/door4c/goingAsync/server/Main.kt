package com.door4c.goingAsync.server

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.coroutines.delay

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/delay/{millisecondsToWait}/{name}") {
                val millisecondsToWait = call.parameters["millisecondsToWait"]?.toLong() ?: 0
                val name = call.parameters["name"] ?: ""

                delay(millisecondsToWait)

                call.respondText("Request: $name, $millisecondsToWait milliseconds")
            }
        }
    }
    server.start(wait = true)
}
