package com.example.Section4.video41

val numbers = listOf<Int>(1, 2, 3)
val mnumbers = mutableListOf<Int>(1, 2, 3)

val people = mapOf(Pair("John", 42), "Jill" to 26)
val mpeople = mutableMapOf(Pair("John", 42), "Jill" to 26)

open class Shape
class Rectangle : Shape()

fun main(args: Array<String>) {
    mnumbers.add(4)
    mpeople.put("Bof", 20)
    mpeople["Jane"] = 24
    println(mpeople["Jill"])

    val jillsAge = people["Jill"] // :Int?

    val rectangles = listOf<Rectangle>(Rectangle())
    val shapes: List<Shape> = rectangles

    val mrectangles = mutableListOf<Rectangle>(Rectangle())
    //val mshapes: MutableList<Shape> = mrectangles // does not compile
            // because the type <E> is not an OUT parameter in MutableList
}