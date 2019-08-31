package dev.nomadblacky.scalajs.sandbox

import org.querki.jquery._
import org.scalajs.dom
import org.scalajs.dom.document

object TutorialApp {
  def main(args: Array[String]): Unit = {
    println("Hello Scala.js!")
    appendPar(document.body, "Hello Scala.js!")
    $(() => setupUI())
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello jQuery!</p>")
    $("#click-me-button").click(() => addClickedMessage())
  }
}
