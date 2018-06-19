package algorithmic.toolbox.week2

import java.util.*

fun main(vararg args : String) {
  val scanner = Scanner(System.`in`)
  val a = scanner.nextLong()
  val b = scanner.nextLong()

  println(gcd(a, b))
}

fun gcd(a: Long, b: Long): Long {
  return gcdInternal(Math.max(a, b), Math.min(a, b))
}

private fun gcdInternal(a: Long, b: Long): Long {
  val remainder = a % b
  if (remainder == 0L) return b
  return gcdInternal(b, remainder)
}
