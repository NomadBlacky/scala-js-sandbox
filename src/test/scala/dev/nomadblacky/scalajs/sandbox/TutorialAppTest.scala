package dev.nomadblacky.scalajs.sandbox

import org.querki.jquery._
import utest._

object TutorialAppTest extends TestSuite {

  TutorialApp.setupUI()

  def tests: Tests = Tests {
    'HelloWorld - {
      assert($("p:contains('Hello jQuery!')").length == 1)
    }
  }
}
