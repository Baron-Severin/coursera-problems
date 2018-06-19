package algorithmic.toolbox.week2

import java.util.*


fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextLong()

  println(fibonacci(n))
}

fun fibonacci(n: Long): Long {
  if (n <= 1) return n

  var old = 0L
  var recent = 1L

  for (i in 2..n) {
    val next = old + recent
    old = recent
    recent = next
  }
  return recent
}

