name := "smartbrewed"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.53.0"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4"
)