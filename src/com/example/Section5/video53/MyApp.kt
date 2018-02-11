package com.example.Section5.video53

import javafx.application.Application
import javafx.event.EventTarget
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
        with(primaryStage) {

            hbox(10) {

                paddingHorizontal = 20
                paddingVertical = 10

                println(paddingAll)
                label("Hello Kotlin") {
                    style = "-fx-font-size: 22px"
                }
                button("Click me")
                        .setOnAction {
                            println("You clicked the button!")
                        }
            }

            show()
        }
    }
}

// EventTarget is a common predecessor of HBox and Stage
fun EventTarget.hbox(spacing: Number? = null, fn: HBox.() -> Unit) {
    val hbox = HBox()
    if (spacing != null) hbox.spacing = spacing.toDouble()

    when (this) { // this is the eventtarget
        is Stage -> scene = Scene(hbox)
        is Pane -> add(hbox)
    }

    fn(hbox)
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
fun Pane.label(text: String, fn: (Label.() -> Unit)? = null): Label {
    val label = Label(text)
    add(label)
    fn?.invoke(label) // if (fn!=null) ...
    return label
}
fun Pane.button(text: String): Button = Button(text).apply {
    this@button.add(this)
}

fun main(args: Array<String>) {
    Application.launch(MyApp::class.java)
}