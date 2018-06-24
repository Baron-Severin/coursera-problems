package leetcode.day4

import kotlin.math.abs

fun divide(dividend: Int, divisor: Int): Int {

  val negative = (dividend < 0) xor (divisor < 0)
  val dividend = abs(dividend.toLong())
  val divisor = abs(divisor.toLong())

  var count = 0L
  var build = divisor
  while (build < dividend) {
    build += divisor
    count++
  }
  println("Count: $count")
  var result = count
  if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) return 1
  if (negative) result = 0 - result

  return result.toInt()
}
