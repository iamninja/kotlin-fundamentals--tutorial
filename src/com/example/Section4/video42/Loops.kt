package com.example.Section4.video42

val numbers = listOf(1, 2, 3)
val people = mapOf("John" to 42, "Jane" to 26)

fun main(args: Array<String>) {
    for (n in numbers) println(n)

    numbers.forEach { n -> println(n) }
    numbers.forEach { println(it) }

    // Do-while
    do {
        val index = Math.random() * numbers.size
        val number = numbers[index.toInt()]
        println("Random $number")
    } while (number != 3)

    // Break to labels
    outer@ for (i in 1..100) {
        for (j in 1..10) {
            if (i == 6 && j == 5)
                break@outer
            println("i = $i, j = $j")
        }
    }

    // Iterating maps with entry
    for (entry in people) {
        println("${entry.key} is ${entry.value} years old.")
    }

    for ((name, age) in people) {
        println("$name is $age years old.")
    }
}