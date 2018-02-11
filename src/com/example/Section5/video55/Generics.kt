package com.example.Section5.video55

import javafx.scene.Node
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox

val hboxes = mutableListOf<HBox>()
val nodes: List<Node> = hboxes

inline fun <reified T : Node> Pane.childrenOfType() = children.mapNotNull { it as? T }

fun main(args: Array<String>) {
    val pane = Pane()
    pane.children.add(VBox())
    pane.children.add(HBox())

    val vboxes = pane.childrenOfType<VBox>()
    val hboxes: List<HBox> = pane.childrenOfType()
    val labels = pane.childrenOfType<Label>()

    println(vboxes) // not empty
    println(hboxes) // not empty
    println(labels) // empty
}