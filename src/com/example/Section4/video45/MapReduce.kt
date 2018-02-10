package com.example.Section4.video45

import kotlin.reflect.full.declaredMemberProperties

data class Person(val name: String, val age: Int)

val people = listOf(
        Person("John Doe", 42),
        Person("Jane Doe", 26),
        Person("Bob Builder", 20)
)

var emptyPeople = emptyList<Person>()

object Result {
    val ages = people.map { it.age }
    val firstNames = people
            .map { it.name }.map { it.substringBefore(" ") }
    val totalAge = people
            .map { it.age }.reduce { total, age -> total + age }
    // Because totalAge is an Int, if an age is null this will have a problem
    val emptySafeTotalAge = people
            .map { it.age }.fold(0) { total, age -> total + age }
    val simplerTotalAge = people.sumBy { it.age } // This is also null-safe
    val sortedAges = people.map { it.age }.sorted().reversed()
    val peopleSortedByAge = people.sortedBy { it.age }
    val namesSortedByAge = people.sortedBy { it.age }.map { it.name }
}

fun main(args: Array<String>) {
    Result::class.declaredMemberProperties.forEach {
        println("${it.name}: ${it.get(Result)}")
    }
}