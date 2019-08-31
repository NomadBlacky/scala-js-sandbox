package dev.nomadblacky.scalajs.sandbox

import org.querki.jquery._
import utest._

object TutorialAppTest extends TestSuite {

  TutorialApp.setupUI()

  def tests: Tests = Tests {
    'HelloWorld - {
      assert($("p:contains('Hello jQuery!')").length == 1)
    }

    'ButtonClick - {
      def messageCount =
        $("p:contains('You clicked the button!')").length

      val button = $("button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      (1 to 5).foreach { i =>
        button.click()
        assert(messageCount == i)
      }
    }
  }
}
