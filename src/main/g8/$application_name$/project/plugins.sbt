logLevel := Level.Warn

// The Typesafe repository contains all required dependencies
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("play" % "sbt-plugin" % "$play_version$")
