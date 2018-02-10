package com.example.Section4.video43

fun printNames(vararg names: String) {
    for (name in names) println(name)
}

fun greetNames(vararg names: String, greeting: String) {
    for (name in names) println("$greeting $name")
}

fun greetNamesWithHeading(vararg names: String, heading: String) {
    println("=== $heading ===")
    //printNames(names) // Type mismatch
    printNames(*names)
}

fun greetNamesWithHeading(names: List<String>, heading: String) {
    println("=== $heading ===")
    //printNames(names) // Type mismatch
    printNames(*names.toTypedArray())
}

fun main(args: Array<String>) {
    printNames("John", "Jane", "Bod")
    greetNames( "John", "Jane", "Bod", greeting = "Hello")
    greetNamesWithHeading( listOf("John", "Jane", "Bod"), heading = "List of names")
}