package leetcode.day13

import leetcode.day13.Direction.*

enum class Direction {
  UP, DOWN, RIGHT, LEFT;

  fun nextPosition(i: Int, j: Int): Pair<Int, Int> {
    return when (this) {
      UP -> i - 1 to j
      DOWN -> i + 1 to j
      RIGHT -> i to j + 1
      LEFT -> i to j - 1
    }
  }
}


  fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    // Hold on to current top, left, right, bot
    // Hold on to current direction
    // When hit the end, update direction
    if (matrix.isEmpty()) return emptyList()

    var direc = RIGHT
    var top = 0
    var bot = matrix.lastIndex
    var left = 0
    var right = matrix[0].lastIndex

    val spiraled = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (top <= bot && left <= right) {
      spiraled += matrix[i][j]
      val n = direc.nextPosition(i, j)
      when {
        n.first < top -> {
          direc = RIGHT
          left++
        }
        n.first > bot -> {
          direc = LEFT
          right--
        }
        n.second < left -> {
          direc = UP
          bot--
        }
        n.second > right -> {
          direc = DOWN
          top++
        }
      }
      val next = direc.nextPosition(i, j)
      i = next.first
      j = next.second
    }
    return spiraled
  }

