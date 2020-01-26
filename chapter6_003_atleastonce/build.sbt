val akkaVersion = "2.5.27"

organization := "com.example"
name := "atleastonce"

libraryDependencies ++= Seq(
"com.typesafe.akka"      %% "akka-actor"       % akkaVersion,
"com.typesafe.akka"      %% "akka-persistence" % akkaVersion
)
