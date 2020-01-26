val akkaVersion = "2.5.27"

scalaVersion := "2.13.1"

name := "catalogLoader"

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"       % akkaVersion,
  "com.typesafe.akka"      %% "akka-stream"      % akkaVersion
)
