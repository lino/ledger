name := "ledger"
 
version := "0.1"
 
scalaVersion := "2.11.0"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= {
  val akkaV = "2.3.3"
  val sprayV = "1.3.1"
  Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "io.spray" % "spray-can" % sprayV
  )
}
