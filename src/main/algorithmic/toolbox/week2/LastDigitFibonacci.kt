package algorithmic.toolbox.week2

import java.math.BigInteger
import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextLong()

  println(lastFibonacci(n))
}

fun lastFibonacci(n: Long): Int {
  if (n <= 1) return n.toInt()

  var old = BigInteger.ZERO
  var recent = BigInteger.ONE

  for (i in 2..n) {
    val next = old.plus(recent)
    old = recent
    recent = next
  }
  return recent.toString().last().toString().toInt()
}