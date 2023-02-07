package com.example.mahjongscanner

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform