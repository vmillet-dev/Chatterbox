package dev.vmillet.chatterbox.dto

data class RegisterRequest(
    val email: String,
    val username: String,
    val password: String
)