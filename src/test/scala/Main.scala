/**
 * Created by FScoward on 2015/02/02.
 */
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Main extends Simulation {
  val req = http("github").get("https://github.com/gatling/gatling").check(status.is(200))
  val scn = scenario("request").exec(req)

  setUp(scn.inject(atOnceUsers(1)))
}
