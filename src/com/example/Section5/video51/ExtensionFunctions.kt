package com.example.Section5.video51

import javafx.application.Application
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import javafx.stage.Stage
import javafx.scene.control.Label
import javafx.scene.layout.Pane

class MyApp : Application() {
    override fun start(primaryStage: Stage) {
        //val root = VBox() // HBox()

        //root.children.add(Label("Hello Kotlin"))
        //root.label("Hello Kotlin")

        //val btn = Button("Click me")
        //btn.setOnAction {
        //    println("You clicked the button!")
        //}
        //root.children.add(btn)
        //root.button("Click me")
        //    .setOnAction {
        //        println("You clicked the button!")
        //    }

        val root = VBox().apply {
            label("Hello Kotlin")
            button("Click me")
                    .setOnAction {
                        println("You clicked the button!")
                    }
        }

        // You can return and assign with with
        with(primaryStage) {
            scene = Scene(root)
            show()
        }

        // Equivalently
        //primaryStage.scene = Scene(root)
        //primaryStage.show()
    }
}

//fun VBox.label(text: String) = children.add(Label(text))
// To add the same label function to Hbox as well we instead extend Pane which is
// a parent to both of them
//fun Pane.label(text: String) = children.add(Label(text))
//fun Pane.button(text: String): Button {
//    val btn = Button(text)
//    children.add(btn)
//    return btn
//}
//fun Pane.button(text: String): Button = Button(text).apply {
//            this@button.children.add(this)
//        }

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