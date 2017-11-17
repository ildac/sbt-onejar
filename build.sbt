name := "sbt-onejar"

crossSbtVersions := Seq("0.13.16", "1.0.0")

//ScriptedPlugin.scriptedSettings

//scriptedLaunchOpts += ("-Dplugin.version=" + version.value)

organization := "org.scala-sbt.plugins"

version := "0.9-SNAPSHOT"

sbtPlugin := true

scalacOptions in Compile ++= Seq("-deprecation")

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

//ScriptedPlugin.scriptedSettings.filterNot(_.key.key.label == libraryDependencies.key.label)
//libraryDependencies ++= {
//  CrossVersion.binarySbtVersion(scriptedSbt.value) match {
//    case "0.13" =>
//      Seq(
//        "org.scala-sbt" % "scripted-sbt" % scriptedSbt.value % scriptedConf.toString,
//        "org.scala-sbt" % "sbt-launch" % scriptedSbt.value % scriptedLaunchConf.toString
//      )
//    case _ =>
//      Seq(
//        "org.scala-sbt" %% "scripted-sbt" % scriptedSbt.value % scriptedConf.toString,
//        "org.scala-sbt" % "sbt-launch" % scriptedSbt.value % scriptedLaunchConf.toString
//      )
//  }
//}

publishMavenStyle := false