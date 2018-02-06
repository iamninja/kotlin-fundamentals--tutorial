package com.example.Section3.video35

import java.time.LocalTime

val strings = listOf(
        "Hello World",
        "Hello\nWorld",
        "The time is ${LocalTime.now()}",
        """We have
            multiple lines
            in this string
        """,
        """We have
            |multiple lines
            |in this string
            |""".trimMargin("|") // pipe is the default
)

fun main(args: Array<String>) {
    strings.forEach(::println)
}