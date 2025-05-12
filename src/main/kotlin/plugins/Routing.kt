package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import com.example.room.RoomController
import com.example.routes.chatSocket
import com.example.routes.getAllMessages

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    routing {
        // Now you can define your routes here
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
