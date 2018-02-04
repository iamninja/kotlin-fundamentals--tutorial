package com.example.video23

interface Greeter {
    fun hello(name: String): String
}

//open class Person (val name: String, val age: Int): Greeter {
//    override fun hello(name: String) = "Hello, $name, I'm ${this.name}"
//}

abstract class Person (val name: String): Greeter {
    abstract val age: Number
    override fun hello(name: String) = "Hello, $name, I'm ${this.name}"
    abstract fun goodbye(): String
}

class Customer(val id: Int, name: String, override var age: Long): Person(name) {
    // we can move this to the constructor
    // override val age: Int = age
    override fun goodbye() = "Bye!"
}

fun main(args: Array<String>) {
//    Abstract classes can not instantiate
//    val greeter: Greeter = Person("John", 42)
//    println(greeter.hello("Edvin"))

    val c1 = Customer(1, "John", 42)
}