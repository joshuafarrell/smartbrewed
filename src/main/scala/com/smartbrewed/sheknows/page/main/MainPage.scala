package com.smartbrewed.sheknows.page.main

import com.smartbrewed.utils.{BrowserAction, EventType}
import org.openqa.selenium.WebDriver
import org.scalatest.selenium.{Page, WebBrowser}
import com.github.nscala_time.time.Imports._

/**
  * Created by jfarrell on 4/15/16.
  */
class MainPage extends Page with MainLocators with WebBrowser with BrowserAction{
  val url = "http://www.sheknows.com"

  def clickProfilePicture()(implicit eventType: EventType, driver: WebDriver){
    click(profilePicture)
  }

  def loginUsingTwitter()(implicit eventType: EventType, driver: WebDriver){

  }

  def registerANewUser(firstName: String, lastName: String, email: String, username: String, password: String)
                      (implicit eventType: EventType, driver: WebDriver){
    click(createAccountLink)

    println(windowHandles)

    switch to window(windowHandles.last)

    textField(firstNameTextField).value = firstName
    textField(lastNameTextField).value = lastName
    emailField(emailTextField).value = email
    textField(usernameTextField).value = username
    pwdField(passwordTextField).value = password
    monthField(birthDateMonthTextField).value = "1"

    submit()
  }

  def clickNew()(implicit eventType: EventType, driver: WebDriver) {
    click(newLink)
  }

}

