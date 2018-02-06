package com.example.Section3.video36

data class Point(val x: Number, val y: Number)

fun main(args: Array<String>) {
    val a = Point(1,2)
    val b = Point(1,2)
    assert(a == b)  // Structural equality: true
    //assert(a === b) // Referential equality, check if it points to the same object: false
    //assert(a != b)  // Structural equality negation: false
    assert(a !== b) // Referential equality negation: true

    val c: Point? = null
    assert(c == null) // java equivalent: c.equals(null) NullPointerException in java
                        // but kotlin handles it well.
}