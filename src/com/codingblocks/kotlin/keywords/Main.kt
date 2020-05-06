package com.codingblocks.kotlin.keywords

fun main() {
    val p = Person()

    p.`when`("angry").shout("Get out of here")
    p.`when`("happy").say("Please come back!")

    p.setMood("angry")
    p.setMood("happy")

    // when, in, object
}