package com.msu.app

import com.msu.app.utils.respondCss
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import kotlinx.html.*


fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(io.ktor.http.HttpStatusCode.OK) {
                    head {
                        title("Kotlin Fullstack App")
                    }

                    body {
                        h1 {
                            +"Index page"
                        }
                    }
                }
            }

            get("/styles.css") {
                call.respondCss {

                }
            }

            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
}