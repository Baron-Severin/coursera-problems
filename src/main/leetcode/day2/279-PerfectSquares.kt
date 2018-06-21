package leetcode.day2

import kotlin.math.sqrt

fun numSquares(n: Int): Int {
  val arr = IntArray(n + 1) { Integer.MAX_VALUE - 1 }

  val root = sqrt(n.toDouble()).toInt()
  val squares = (root downTo 1).map { it * it }

  squares.forEach {  square ->
    if (square > n) return@forEach
    arr[square] = 1
    for (i in square + 1 .. n) {
      if (arr[i] > arr[i - square] + 1) {
        arr[i] = arr[i - square] + 1
      }
    }
  }

  if (arr[n] == Integer.MAX_VALUE) return -1
  return arr[n]
}
