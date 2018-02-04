package com.example.Section3.video32

import java.time.LocalDateTime

data class Customer(val name: String)

interface CustomerEventListener {
    fun customerSaved(customer: Customer)
    fun customerDeleted(customer: Customer)
}

class CustomerService {
    companion object {
        val listeners = mutableListOf<CustomerEventListener>()
        @JvmStatic
        fun addListener(listener: CustomerEventListener) {
            listeners.add(listener)
        }
    }

    fun save(customer: Customer) {
        val data = gatherData(customer)
        listeners.forEach { listener -> listener.customerSaved(customer) }
    }

    fun delete(customer: Customer) {
        listeners.forEach { listener -> listener.customerDeleted(customer) }
    }

    private fun gatherData(customer: Customer) = object {
        val created = LocalDateTime.now()
        val x = 42
    }
}

fun main(args: Array<String>) {
    val service = CustomerService()
    //val serviceCompanion = CustomerService.Companion
    //serviceCompanion.addListener()
    CustomerService.addListener(object : CustomerEventListener {
        override fun customerSaved(customer: Customer) {
            println("$customer saved")
        }

        override fun customerDeleted(customer: Customer) {
            println("$customer deleted")
        }
    })
    service.save(Customer("John"))
}