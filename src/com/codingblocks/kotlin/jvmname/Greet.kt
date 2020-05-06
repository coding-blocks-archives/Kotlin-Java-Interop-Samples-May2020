@file:JvmName("Greet")
package com.codingblocks.kotlin.jvmname

import java.util.*

fun greeter(name: String): String {
    val cal = Calendar.getInstance()
    if (cal.get(Calendar.HOUR_OF_DAY) < 12) {
        return "Good Morning $name"
    }
    if (cal.get(Calendar.HOUR_OF_DAY) < 18) {
        return "Good Afternoon $name"
    }
    return "Good Night $name"
}