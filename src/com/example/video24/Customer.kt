package com.example.video24

import java.util.*

data class Customer(val ide: UUID, val name: String, val discount: Double)

//object CustomerService {
//    fun create(name: String, id: UUID? = null): Customer {
//        return Customer(id ?: UUID.randomUUID(), name)
//    }
//}

object CustomerService {
    fun create(name: String, id: UUID = UUID.randomUUID(), discount: Double = 0.0): Customer {
        return Customer(id, name, discount)
    }
}

fun main(args: Array<String>) {
    val c1 = CustomerService.create("John")
    val c2 = CustomerService.create("Jane", UUID(1,1))
    val c3 = CustomerService.create(discount = 50.0, name = "Jill")
    println(c1)
    println(c2)
    println(c3)
}
