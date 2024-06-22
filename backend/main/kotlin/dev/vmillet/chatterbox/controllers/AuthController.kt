package dev.vmillet.chatterbox.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("auth")
class AuthController {

    @PostMapping("register")
    fun register(): ResponseEntity<String> {
        return ResponseEntity.ok("register")
    }

}