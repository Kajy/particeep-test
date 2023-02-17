package com.particeep.test.basic

import cats.syntax.list._

/**
 * Compute the average of the list
 *
 * ex : [1, 10, 16] -> 9
 */
object ComputeAverage {

  def average(l: List[Double]): Double = {
    l.toNel match {
      case Some(nel) => nel.reduce / nel.size
      case None      => 0
    }
  }

}
