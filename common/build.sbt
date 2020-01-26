val akkaVersion = "2.5.27"

name := "common"

organization := "com.rarebooks"

libraryDependencies ++= Seq(
  "com.typesafe.akka"        %% "akka-actor"                % akkaVersion,
  "org.scala-lang.modules"   %% "scala-parser-combinators"  % "1.1.2",
  "com.typesafe.akka"        %% "akka-testkit"              % akkaVersion    % "test",
  "org.scalatest"            %% "scalatest"                 % "3.1.0"        % "test"
)
