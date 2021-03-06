package com.jetbrains.handson.httpapi

import com.jetbrains.handson.httpapi.registerCustomerRoutes
import com.jetbrains.handson.httpapi.registerOrderRoutes
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.serialization.json


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}