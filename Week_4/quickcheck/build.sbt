course := "effective-scala"
assignment := "quickcheck"

scalaVersion := "3.1.0"
scalacOptions ++= Seq("-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.17.0"
