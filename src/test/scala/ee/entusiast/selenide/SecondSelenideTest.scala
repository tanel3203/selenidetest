package ee.entusiast.selenide

import com.codeborne.selenide.Selenide._
import com.codeborne.selenide.Condition
import org.openqa.selenium.By
import org.scalatest.FreeSpec

class SecondSelenideTest extends FreeSpec {

  "execute joint code from separate method (1)" in {
    openGoogle
    inputTextAndPressEnter("Paper planes")
    assertHasResult("Paper Planes - Wikipedia")

  }

  "execute joint code from separate method (2)" in {
    openGoogle
    inputTextAndPressEnter("Small trains")
    assertHasResult("Ridable miniature railway - Wikipedia")
  }


  def openGoogle:Unit =
    open("http://www.google.com")


  def inputTextAndPressEnter(text: String): Unit =
    $(By.name("q"))
      .setValue(text)
      .pressEnter()

  def assertHasResult(shouldHaveText: String): Unit =
    $(By.xpath(s"//a[text()='$shouldHaveText']"))
      .shouldBe(Condition.visible)
}

