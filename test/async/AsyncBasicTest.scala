package async

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

import com.particeep.test.async.AsyncBasic
import org.scalatestplus.play.PlaySpec

class AsyncBasicTest extends PlaySpec {
  "AsyncBasic" should {
    "compute" in {
      Await.result(AsyncBasic.compute("5"), 10.seconds) mustBe Left("No value")
      Await.result(AsyncBasic.compute("9"), 10.seconds) mustBe Left("No value call 1")
      Await.result(AsyncBasic.compute("1"), 10.seconds) mustBe Right(1099)
    }
  }
}
