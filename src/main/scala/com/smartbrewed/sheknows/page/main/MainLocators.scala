package com.smartbrewed.sheknows.page.main

import org.openqa.selenium.WebDriver
import org.scalatest.selenium.WebBrowser

/**
  * Created by jfarrell on 4/15/16.
  */
trait MainLocators extends WebBrowser {
  lazy val profilePicture: Query = id("header-user-photo")

  lazy val newLink: Query = cssSelector("a[href='/new']")
  lazy val hotLink: Query = cssSelector("a[href='/hot']")
  lazy val videoLink: Query = cssSelector("a[href='/video']")

  lazy val facebookLink: Query = partialLinkText("Connect with Facebook")
  lazy val twitterLink: Query = partialLinkText("Connect with Twitter")
  lazy val googleLink: Query = partialLinkText("Connect with Google")
  lazy val connectLink: Query = partialLinkText("Sheknows Connect")
  lazy val createAccountLink: Query = partialLinkText("Create an account")

    lazy val firstNameTextField: Query = id("registration_firstname")
    lazy val lastNameTextField: Query = id("registration_lastname")
    lazy val emailTextField: Query = id("registration_email")
    lazy val usernameTextField: Query = id("registration_username")
    lazy val passwordTextField: Query = id("registration_plainPassword")
    lazy val birthDateMonthTextField: Query = id("registration_birthdate_month")
    lazy val birthDateDayTextField: Query = id("registration_birthdate_day")
    lazy val birthDateYearTextField: Query = id("registration_birthdate_year")
    lazy val createAccountButton: Query = cssSelector("button.sheknows")
    lazy val alreadyHaveAccountLink: Query = linkText("I already have an account")
}
