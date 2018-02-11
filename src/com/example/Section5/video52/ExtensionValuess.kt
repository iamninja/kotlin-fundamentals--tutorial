package com.example.Section5.video52

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import javafx.stage.Stage
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane

class MyApp : Application() {
    override fun start(primaryStage: Stage) {

        val root = HBox(10.0).apply {

            //padding = Insets(10.0, 20.0, 10.0, 20.0)
            paddingHorizontal = 20
            paddingVertical = 10

            println(paddingAll)
            label("Hello Kotlin")
            button("Click me")
                    .setOnAction {
                        println("You clicked the button!")
                    }
        }

        with(primaryStage) {
            scene = Scene(root)
            show()
        }
    }
}

val HBox.paddingAll: Int
    get() = (padding.top + padding.right + padding.bottom + padding.left).toInt()

var HBox.paddingHorizontal: Number
    get() = (padding.left + padding.right) / 2
    set(value) {
        padding = Insets(padding.top, value.toDouble(), padding.bottom, value.toDouble())
    }

var HBox.paddingVertical: Number
    get() = (padding.top + padding.bottom) / 2
    set(value) {
        padding = Insets(value.toDouble(), padding.right, value.toDouble(), padding.left)
    }

fun Pane.add(node: Node): Pane {
    children.add(node)
    return this
}
fun Pane.label(text: String) = add(Label(text))
fun Pane.button(text: String): Button = Button(text).apply {
    this@button.add(this)
}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java)
}