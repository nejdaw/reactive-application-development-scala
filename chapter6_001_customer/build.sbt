val akkaVersion = "2.5.27"
val logbackVer = "1.2.1"

name := "customer"

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"       % akkaVersion,
  "com.typesafe.akka"      %% "akka-remote"      % akkaVersion,
  "com.typesafe.akka"      %% "akka-slf4j"       % akkaVersion,
  "ch.qos.logback"         %  "logback-classic"  % logbackVer,
  "com.typesafe.akka"      %% "akka-testkit"     % akkaVersion    % "test",
  "org.scalatest"          %% "scalatest"        % "3.1.0"        % "test"
)

addCommandAlias("ca", "runMain com.rarebooks.library.CustomerApp -Dakka.remote.netty.tcp.port=2552")
