ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

ThisBuild / usePipelining := true

ThisBuild / logLevel := Level.Debug

lazy val root = (project in file("."))
  .settings(
    name := "PipeLiningDeadLock"
  )
  .dependsOn(entities)

lazy val entities = (project in file("entities"))
  .settings(
    name := "entities"
  )
