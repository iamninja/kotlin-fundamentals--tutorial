package com.example.Section3.video33

val x: Any? = "Hello World"

class Obj {
    var x: Any? = "Hello World"
}

fun main(args: Array<String>) {
    if (x is String) {
        println(x.length)
    }

    if (x !is String) {
        println("Not a String")
    } else {
        println(x.length)
    }

    val a = x as String
    val b = x as? String
    val c = x as? String ?: return

    println(x.length)

    val o = Obj()
    // Can't do the following because an other thread may change the type of o.x
    // and length may be unavailable
    //if (o.x is String) {
    //  println(o.x.length)
    //}
    // Instead we can do the following
    (o.x as? String)?.apply {
        // Both print the same
        println(this.length)
        println(length)
    }
}