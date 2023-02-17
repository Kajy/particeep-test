package com.particeep.test.basic

import org.scalatestplus.play.PlaySpec

class BasicScalaTest extends PlaySpec {

  "BasicScala" should {

    "encode params in url" in {
      BasicScala.encodeParamsInUrl(
        Map("param1" -> "value1", "param2" -> "value2")
      ) mustBe "?param1=value1&param2=value2"
      BasicScala.encodeParamsInUrl(Map()) mustBe ""
    }

    "compute email" in {
      BasicScala.isEmail("jean@particeep.com") mustBe true
      BasicScala.isEmail("jean_particeep.com") mustBe false
    }

    "power" in {
      BasicScala.power(2, 3) mustBe 8
      BasicScala.power(10, 2) mustBe 100
      BasicScala.power(6, 7) mustBe 279936
      BasicScala.power(9999, 0) mustBe 1
      BasicScala.power(2, -3) mustBe 0.125
    }
  }
}
