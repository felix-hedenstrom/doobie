val sbtTypelevelVersion = "0.5.0-RC3"

addSbtPlugin("com.lightbend.paradox"     % "sbt-paradox"             % "0.10.3")
addSbtPlugin("com.github.sbt"            % "sbt-site-paradox"        % "1.5.0")
addSbtPlugin("com.github.sbt"            % "sbt-ghpages"             % "0.8.0")
addSbtPlugin("org.typelevel"             % "sbt-typelevel-ci-release" % sbtTypelevelVersion)
addSbtPlugin("org.typelevel"             % "sbt-typelevel-mergify"   % sbtTypelevelVersion)
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"             % "0.6.2")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"                 % "0.4.5")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"              % "5.10.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"            % "0.1.21")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"                % "2.3.7")
