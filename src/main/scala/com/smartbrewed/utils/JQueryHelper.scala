package com.smartbrewed.utils

import org.openqa.selenium.{JavascriptExecutor, WebDriver}
import org.scalatest.Matchers
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.time.{Seconds, Span}

/**
  * Created by jfarrell on 4/20/16.
  */
object JQueryHelper extends Eventually with Matchers {
  def pageIsLoadedAndAjaxIsCompleted()(implicit driver: WebDriver) = {
    eventually(timeout(Span(30, Seconds))) {
      withClue("Ajax calls may not have completed within time specified"){
        driver.asInstanceOf[JavascriptExecutor].executeScript("return jQuery.active") should be (0)
      }
    }
  }

  def click(query: WebBrowser#Query)(implicit driver: WebDriver) = {
    driver.asInstanceOf[JavascriptExecutor].executeScript("arguments[0].click();", query.webElement)
  }
}
