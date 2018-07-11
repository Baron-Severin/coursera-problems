import java.lang.Math.pow

enum class Direction {
  RIGHT, DOWN, LEFT, UP;

  fun next(): Direction {
    return when (this) {
      RIGHT -> DOWN
      DOWN -> LEFT
      LEFT -> UP
      UP -> RIGHT
    }
  }
}
  fun generateMatrix(n: Int): Array<IntArray> {
    val board = Array(n) { IntArray(n) }
    var left = 0
    var right = n - 1
    var top = 0
    var bot = n - 1
    var dir = Direction.RIGHT

    var pos = 0 to 0
    var value = 1
    for (i in 1..pow(n.toDouble(), 2.toDouble()).toInt()) {
      board[pos.first][pos.second] = value
      value++
      var loc = nextPos(dir, pos)
      if (loc.first < top || loc.first > bot || loc.second < left || loc.second > right) {
        when {
          loc.first < top -> left++
          loc.first > bot -> right--
          loc.second < left -> bot--
          loc.second > right -> top++
        }
        dir = dir.next()
        loc = nextPos(dir, pos)
      }
      pos = loc
    }
    return board
  }

fun nextPos(d: Direction, pos: Pair<Int,Int>): Pair<Int, Int> {
  return when (d) {
    Direction.RIGHT -> pos.first to pos.second + 1
    Direction.DOWN -> pos.first + 1 to pos.second
    Direction.LEFT -> pos.first to pos.second - 1
    Direction.UP -> pos.first - 1 to pos.second
  }
}