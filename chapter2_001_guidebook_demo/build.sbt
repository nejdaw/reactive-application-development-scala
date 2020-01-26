name := "Guidebook_Demo"

version := "1.0"

val akkaVersion = "2.5.27"

scalaVersion := "2.13.1"

resolvers += "Lightbend Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)
