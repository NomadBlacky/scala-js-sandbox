import Dependencies._

ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "dev.nomadblacky"
ThisBuild / organizationName := "scala-js-sandbox"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scala-js-sandbox",
    libraryDependencies += scalaTest % Test,
    scalaJSUseMainModuleInitializer := true
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
