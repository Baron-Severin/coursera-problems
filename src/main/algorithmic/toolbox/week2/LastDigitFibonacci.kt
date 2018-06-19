package algorithmic.toolbox.week2

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()

  println(lastFibonacci(n))
}

fun lastFibonacci(n: Int): Int {
  if (n <= 1) return n

  var old = 0
  var recent = 1

  for (i in 2..n) {
    val next = old + recent
    old = recent % 10
    recent = next % 10
  }
  return recent
}