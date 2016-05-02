package com.smartbrewed.utils.basespec

import org.scalatest.selenium.WebBrowser
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by jfarrell on 4/25/16.
  */
abstract class SeleniumSpec extends FeatureSpec with GivenWhenThen with WebBrowser {

}
