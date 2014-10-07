// Include the Android plugin
androidDefaults

// Name of your app
name := "Scratch"

// Version of your app
version := "0.1"

// Version number of your app
versionCode := 0

// Version of Scala
scalaVersion := "2.10.2"

// Version of the Android platform SDK
platformName := "android-19"

resolvers += Resolver.file("Local repo", file(System.getProperty("user.home") + "/.ivy2/local"))(Resolver.ivyStylePatterns)
