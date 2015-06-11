name := "play-pac4j-java-demo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.pac4j" % "play-pac4j-java" % "1.5.0-SNAPSHOT",
  "org.pac4j" % "pac4j-http" % "1.7.0",
  "org.pac4j" % "pac4j-cas" % "1.7.0",
  "org.pac4j" % "pac4j-openid" % "1.7.0",
  "org.pac4j" % "pac4j-oauth" % "1.7.0",
  "org.pac4j" % "pac4j-saml" % "1.7.0",
  "org.pac4j" % "pac4j-oidc" % "1.7.0",
  "com.typesafe.play" % "play-cache_2.11" % "2.4.0"
)

resolvers ++= Seq(
    //"Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
    "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/",
    "Pablo repo" at "https://raw.github.com/fernandezpablo85/scribe-java/mvn-repo/"
)