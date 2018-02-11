package com.example.Section5.video56

import javafx.event.ActionEvent
import javafx.geometry.Point2D
import javafx.scene.control.Button

// An infix function example
//val x = 1 to 2

infix fun Number.by(n: Number) = Point2D(this.toDouble(), n.toDouble())

val c = 2 by 4
val d = 2.54 by 4
val e = 2.54.by(4)

// Wrap it in apply to return the button
infix fun Button.whenClicked(fn: (ActionEvent) -> Unit) = apply {
    setOnAction(fn)
    // or setOnAction { fn(it) }
}

val button = Button("Click me") whenClicked {
    println("You clicked me")
}