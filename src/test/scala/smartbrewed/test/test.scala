package smartbrewed.test

import org.scalatest._
import org.scalatest.selenium.Chrome

/**
  * Created by jfarrell on 4/14/16.
  */
class test extends FlatSpec with ShouldMatchers with Chrome {
  val host = "http://www.sheknows.com"

  "The sheknows home page" should "have the correct title" in {
    go to (host)
    pageTitle should be ("SheKnows | Entertainment, Recipes, Parenting & Love Advice")
    quit()
  }
}
