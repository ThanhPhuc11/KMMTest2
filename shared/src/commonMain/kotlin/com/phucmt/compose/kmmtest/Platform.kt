package com.phucmt.compose.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform