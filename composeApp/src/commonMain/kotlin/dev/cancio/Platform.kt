package dev.cancio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform