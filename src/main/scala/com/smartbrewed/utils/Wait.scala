package com.smartbrewed.utils

import java.util.concurrent.TimeUnit

import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{WebDriver, WebElement}
import org.scalatest.selenium.WebBrowser

/**
  * Created by jfarrell on 4/19/16.
  */
object Wait extends WebBrowser {
  val DefaultWaitTimeForElement : Int = 30

  /**
    * Wait for the element to clickable in the DOM.
    *
    * Returns an Option of the first WebElement using the given method.
    *
    * @param query selector to find the element
    * @param timeOutInSeconds time to wait until returning None
    * @return an Option of the first WebElement using the given method, or (None if the timeout is reached)
    */

  def waitForElementClickable(query: WebBrowser#Query,
                              timeOutInSeconds: Int = DefaultWaitTimeForElement)
                             (implicit driver: WebDriver): Option[WebElement] = {
    try {
      driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS)
      val element = {
        val wait = new WebDriverWait(driver, timeOutInSeconds)
        wait.until(ExpectedConditions.elementToBeClickable(query.by))
      }
      driver.manage().timeouts().implicitlyWait(DefaultWaitTimeForElement,
        TimeUnit.SECONDS)
      Some(element)
    } catch {
      case e: Exception => None
    }

  }

}
