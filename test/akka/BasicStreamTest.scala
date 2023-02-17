package akka

import java.io.ByteArrayOutputStream

import com.particeep.test.akka.BasicStream
import org.scalatestplus.play.PlaySpec

class BasicStreamTest extends PlaySpec {

  "BasicStream" should {
    "run" in {
      val out = new ByteArrayOutputStream()
      Console.withOut(out) {
        BasicStream.main(Array.empty)
        Thread.sleep(100)
      }

      val valueList = out.toString().split('\n')

      valueList must not contain "1"
      valueList must not contain "3"
      valueList must not contain "999"
      valueList must contain("2")
      valueList must contain("4")
      valueList must contain("6")
    }
  }
}
