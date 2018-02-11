package com.example.Section5.video53

fun repeat(times: Int, fn: () -> Unit) {
    (1..times).forEach { fn() }
}

fun repeatIndexed(times: Int, fn: (Int) -> Unit) {
    (1..times).forEach { fn(it) }
}

fun main(args: Array<String>) {
    repeat(4, { println("Hello Kotlin") })
    // Equivalently
    repeat(4) {
        println("Hello Kotlin")
    }

    repeatIndexed(4) { index ->
        println("$index. Hello Kotlin")
    }
}