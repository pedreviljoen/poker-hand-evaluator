
name := "poker-hand-evaluator"

version := "0.1"

scalaVersion := "2.12.7"

val testDependancies = {
  Seq(
    "org.scalatest" % "scalatest_2.11" % "3.0.0-SNAP4",
    "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"
  )
}
