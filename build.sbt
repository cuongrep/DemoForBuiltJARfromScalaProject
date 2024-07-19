ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

// Specify the main class
assembly / mainClass := Some("org.kane.App")

// Add dependencies if any
lazy val root = (project in file("."))
  .settings(
    name := "DemoForBuiltJARfromScalaProject",
    idePackagePrefix := Some("org.kane")
  )

// Assembly settings
assembly / assemblyMergeStrategy := {
  case "reference.conf" => MergeStrategy.concat
  case "application.conf" => MergeStrategy.concat
  case x => MergeStrategy.first
}

assembly / assemblyJarName := "kane-scala-sbt-assembly-fatjar-1.0.jar"

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
