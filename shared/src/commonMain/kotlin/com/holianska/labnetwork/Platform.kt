package com.holianska.labnetwork

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform