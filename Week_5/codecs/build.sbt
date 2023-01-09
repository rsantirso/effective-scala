course := "effective-scala"
assignment := "codecs"

scalaVersion := "3.1.0"
scalacOptions ++= Seq("-deprecation")
libraryDependencies ++= Seq(
  "org.typelevel" %% "jawn-parser"       % "1.4.0",
  "org.scalameta"  %% "munit"            % "0.7.29"  % Test,
  "org.scalameta"  %% "munit-scalacheck" % "0.7.29"  % Test
)
