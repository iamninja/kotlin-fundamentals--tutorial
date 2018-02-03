package com.example.video21

class Person(val name: String, var age: Int) {
    fun nextAge(): Int {
        return age + 1
    }

    fun isOlderThan(other: Person): Boolean {
        return other.age < age
    }

    override fun equals(other: Any?): Boolean {
        return (other is Person && other.name == name && other.age == age)
    }

    override fun toString(): String {
        return "$name is $age years old."
    }
}

fun main(args: Array<String>) {
    val person: Person = Person(name = "John Doe", age = 42)
    val person2: Person = Person(name = "Jane Doe", age = 2)
    //person.age = null // Int are not null-able but Int? are.

    //val nextAge = person.age + 1      // Kotlin doesnt compile this because it may be null
    //val nextAge = person.age!! + 1    // double-bang will allow compilation but is a no-no
    //val nextAge: Int = (person.age ?: 0) + 1  // that's the "right" way to handle nullable
                                                // variables and their assignments
    println(person.nextAge())
    println(person.isOlderThan(person2))
    println(person2)
    println(person.equals(person2))             // ugly
    println(person == person2)
}