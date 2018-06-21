package leetcode.day2

import java.lang.Math.sqrt

fun numSquares(n: Int): Int {
  val arr = IntArray(n + 1)

  val i = sqrt(n.toDouble()).toInt()
  val squares = (i downTo 1).map { it * it }

  squares.forEach { square ->
    arr[square] = 1
    var total = square
    while (total <= n) {
      if (total - square < 0) {
        arr[total] = 1
      } else if (arr[total] == 0 || arr[total] > arr[total - square] + 1) {
        arr[total] = arr[total - square] + 1
      }
      total += square
    }
  }

  return 0
}
