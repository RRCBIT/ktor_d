package com.jetbrains.handson.httpapi

import io.ktor.application.Application
import io.ktor.routing.routing

fun Application.registerOrderRoutes() {
    routing {
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}