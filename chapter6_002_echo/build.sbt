val akkaVersion = "2.5.27"

organization := "com.example"
name := "echo"

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"       % akkaVersion
)
