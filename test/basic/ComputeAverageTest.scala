package basic

import com.particeep.test.basic.ComputeAverage
import org.scalatestplus.play.PlaySpec

class ComputeAverageTest extends PlaySpec {

  "ComputeAverage" should {
    "average" in {
      ComputeAverage.average(List(1, 10, 16)) mustBe 9
      ComputeAverage.average(List(1, 1, 1)) mustBe 1
      ComputeAverage.average(List(1548, 87, 963, 1, 32)) mustBe 526.2
      ComputeAverage.average(List()) mustBe 0
    }
  }
}
