name := "Simple Project"

version := "1.0"

scalaVersion := "2.9.3"

libraryDependencies ++= Seq( "org.spark-project" %% "spark-core" % "0.7.3", 
 "org.scalatest" %% "scalatest" % "1.9.1" % "test" )

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spray Repository" at "http://repo.spray.cc/")


ivyXML :=
<dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="2.5.0.v201103041518">
<artifact name="javax.servlet" type="orbit" ext="jar"/>
</dependency>
