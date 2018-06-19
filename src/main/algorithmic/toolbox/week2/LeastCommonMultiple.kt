package algorithmic.toolbox.week2

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val a = scanner.nextLong()
  val b = scanner.nextLong()

  println(leastCommonMultiple(a, b))
}

fun leastCommonMultiple(a: Long, b: Long): Long {
  fun gcdInternal(a: Long, b: Long): Long {
    val remainder = a % b
    if (remainder == 0L) return b
    return gcdInternal(b, remainder)
  }
  fun gcd(a: Long, b: Long): Long {
    return gcdInternal(Math.max(a, b), Math.min(a, b))
  }

  val bigger = Math.max(a, b)
  val smaller = Math.min(a, b)
  val remainder = gcd(bigger, smaller)
  if (remainder == 0L) return bigger
  return (bigger * smaller) / remainder
}
