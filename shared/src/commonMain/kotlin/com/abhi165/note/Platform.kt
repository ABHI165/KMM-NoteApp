package com.abhi165.note

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform