package com.example.Section3.video34

import java.awt.Color
import java.net.InetAddress
import java.net.UnknownHostException

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val p1 = Person("John", 42)
    val p2 = Person("Jane", 26)

    //val oldest: Person
    //if (p1.age > p2.age)
    //    oldest = p1
    //else
    //    oldest = p2
    // Since if-else is an expression we can do the following
    val oldest: Person = if (p1.age > p2.age)
    {
        println(p1)
        p1
    }
    else
    {
        println(p2)
        p2
    }
}

fun isValidIP(host: String) = try {
    InetAddress.getByName(host)
    true
} catch (ex: UnknownHostException) {
    false
}

fun getColor(person: Person): Color = when (person.age){
    1,2 -> Color.YELLOW
    18 -> Color.RED
    in 30..50 -> Color.MAGENTA
    else -> {
        println(person)
        Color.BLUE
    }
}
