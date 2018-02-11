package com.example.Section4.video46

val numbers = 1..100
val numbers2 = IntRange(1, 100)
val numbers99 = 1 until 100
val backwards = 100 downTo 1
val everyOther = numbers step 2
val alphabet = 'a'..'z'
val contains42 = 42 in numbers
val contains26 = numbers2.contains(26)

fun main(args: Array<String>) {
    val ranges =
            listOf(numbers, numbers2, numbers99, backwards,
                    everyOther, alphabet)
    ranges.forEach(::printRange)
}

fun printRange(range: Iterable<Any>) {
    range.joinToString("").let { println(it) }
}

