package com.smartbrewed.utils

import org.openqa.selenium.WebDriver
import org.scalatest.selenium.WebBrowser

/**
  * Created by jfarrell on 4/18/16.
  */
trait BrowserAction extends WebBrowser {
  /**
    * Click on a WebElement by using native or synthetic event simulation.
    *
    * @param query : WebBrowser#Query to define the webElement
    * @param eventType : Native or Synthetic.
    */
  def click(query: WebBrowser#Query)(implicit eventType: EventType, driver: WebDriver) {
    Wait.waitForElementClickable(query)

    eventType match {
      case Native => query.webElement.click()
      case Synthetic => JQueryHelper.click(query)
    }

    JQueryHelper.pageIsLoadedAndAjaxIsCompleted()
  }
}
