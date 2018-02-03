package com.example.pkg3

import com.example.pkg2.Greeter as G2
import com.example.pkg1.Greeter as G1

fun main(args: Array<String>) {
    println(G1().hello())
    println(G2().hello())
}