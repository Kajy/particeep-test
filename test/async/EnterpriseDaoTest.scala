package async

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

import org.scalatest.OptionValues
import com.particeep.test.async.{ CEO, Enterprise, WhatsWrong2 }
import org.scalatestplus.play.PlaySpec

class EnterpriseDaoTest extends PlaySpec with OptionValues {

  "EnterpriseDao" should {
    "get CEO and Enterprise" in {
      Await.result(WhatsWrong2.getCEOAndEnterprise(Some("1")), 10.seconds).value mustBe (
        CEO("1", "Mark", "Zuckerberg"), Enterprise("1", "Google", "1")
      )

      Await.result(WhatsWrong2.getCEOAndEnterprise(Some("5")), 10.seconds) mustBe None
    }
  }
}
