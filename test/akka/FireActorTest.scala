package akka

import java.io.ByteArrayOutputStream
import java.lang.Thread.sleep

import com.particeep.test.akka.FireActor
import org.scalatestplus.play.PlaySpec

class FireActorTest extends PlaySpec {

  "FireActor" should {
    "fire actor" in {
      val out = new ByteArrayOutputStream()
      Console.withOut(out) {
        FireActor.fireActor()
        sleep(100)
      }

      out.toString must include("Hello there.")
      out.toString must include("What?")
    }
  }
}
