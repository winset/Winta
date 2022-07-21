package com.winset.winta

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}