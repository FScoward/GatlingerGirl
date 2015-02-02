name := "GatlingerGirl"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.4",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.3" % "test",
  "io.gatling"            % "gatling-test-framework"    % "2.1.3" % "test"
)

enablePlugins(GatlingPlugin)
