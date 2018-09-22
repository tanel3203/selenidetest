package ee.entusiast.selenide

import com.codeborne.selenide.Selenide._
import com.codeborne.selenide.Condition._
import com.codeborne.selenide.{Condition, SelenideElement}
import org.openqa.selenium.By
import org.scalatest.FreeSpec

class FirstSelenideTest extends FreeSpec {

  "open browser" in {


    // Step 0. Open page
    val siteName = "http://..."
    open(siteName)

    // Page 1. Click login, input user details, click login button
    val userNameNameAttribute = ""
    val passwordNameAttribute = ""
    val loginButtonClassNameAttribute = ""
    $(By.linkText("Log in")).click()
    $(By.name("email")).setValue(userNameNameAttribute)
    $(By.name("password")).setValue(passwordNameAttribute)
    $(By.className(loginButtonClassNameAttribute)).click()

    // Page 2. Continue to another logged in page.
    val linkText = ""
    $(By.linkText(linkText)).click()

    // Page 3. Expect an element with a classname to have a specific text
    val targetclassNameAttribute = ""
    val hasExactText = ""
    $(By.className(targetclassNameAttribute)).shouldBe(Condition.exactText(hasExactText))

  }
}
