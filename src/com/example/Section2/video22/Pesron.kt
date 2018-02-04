package com.example.Section2.video22

//data class Person(val name: String, val age: Int)

// Introducing secondary constructor
data class Person(val name: String, val age: Int) {
    constructor(s: String): this(s.substringBefore(":"), s.substringAfter(":").toInt())
}

data class HttpResponse(val code: Int, val message: String)

// We can un-data the class but we have to define the component functions
//class HttpResponse(val code: Int, val message: String) {
//    operator fun component1() = code
//    operator fun component2() = message
//}


fun main(args: Array<String>) {
    val person = Person(name = "John", age = 42)
    println(person)
    val (name: String, age: Int) = person

    // val response: HttpResponse = request(uri = "www.notfound.com")
    val (code, message) = request(uri = "www.notfound.com") // to get the values directly

    // Create another data-person by copying and change one value
    val person2 = person.copy(age = 43)
    println(person2)
    println(person == person2)

    // Making persons with the secondary constructor
    val person3 = Person("Jane:26")
    println(person3)
}

fun request(uri: String) = HttpResponse(code = 404, message = "Not found")
// We can use the Pair class in this case
//fun request(uri: String) = Pair(404,"Not found")