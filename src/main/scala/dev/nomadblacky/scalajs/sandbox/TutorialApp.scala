package dev.nomadblacky.scalajs.sandbox

import org.scalajs.dom
import org.scalajs.dom.document
import org.querki.jquery._

import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  def main(args: Array[String]): Unit = {
    println("Hello Scala.js!")
    appendPar(document.body, "Hello Scala.js!")
    $("body").append("<p>Hello jQuery!</p>")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}
