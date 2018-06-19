package algorithmic.toolbox.week2

import java.util.*

fun main(vararg args : String) {
  val scanner = Scanner(System.`in`)
  val a = scanner.nextInt()
  val b = scanner.nextInt()

  println(gcd(a, b))
}

fun gcd(a: Int, b: Int):Int {
  return gcdInternal(Math.max(a, b), Math.min(a, b))
}

private fun gcdInternal(a: Int, b: Int):Int {
  val remainder = a % b
  if (remainder == 0) return b
  return gcdInternal(b, remainder)
}
