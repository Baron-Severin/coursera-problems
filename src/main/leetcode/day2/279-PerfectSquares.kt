package leetcode.day2

import kotlin.math.sqrt

fun numSquares(n: Int): Int {

  val i = sqrt(n.toDouble()).toInt()
  val squares = (i downTo 1).map { it * it }

  return recurse(n, 0, 0, squares) ?: 0
}

fun recurse(n: Int, current: Int, count: Int, squares: List<Int>): Int? {
  val next = squares.map { it + current }.filter { it <= n }
  if (next.isEmpty()) return null
  if (next.any{ it == n }) return count + 1
  return next.mapNotNull { recurse(n, it, count + 1, squares) }.minBy { it }
}
