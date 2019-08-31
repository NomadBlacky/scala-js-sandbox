ThisBuild / scalaVersion := "2.12.9"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.nomadblacky"
ThisBuild / organizationName := "scala-js-sandbox"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scala-js-sandbox",
    libraryDependencies ++= Seq(
        "org.scala-js"  %%% "scalajs-dom" % "0.9.7",
        "org.scalatest" %% "scalatest"    % "3.0.8" % Test
      ),
    scalaJSUseMainModuleInitializer := true
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
