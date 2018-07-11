package leetcode.day20

  fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isEmpty() || matrix.first().isEmpty()) return false
    if (matrix.atArrIndex(matrix.arrSize() - 1) < target || matrix.atArrIndex(0) > target) return false
    var left = 0
    var right = matrix.arrSize()
    var mid: Int
    while (left < right) {
      mid = (left + right) / 2
      val value = matrix.atArrIndex(mid)
      if (target == value) return true
      else if (target < value) {
        right = mid - 1
      } else if (target > value) {
        left = mid + 1
      }
    }
    return matrix.atArrIndex(left) == target
  }

fun Array<IntArray>.arrSize(): Int {
  return this.map { it.size }.sum()
}

fun Array<IntArray>.atArrIndex(i: Int): Int {
  val pos = this.arrIndex(i)
  return this[pos.first][pos.second]
}

fun Array<IntArray>.arrIndex(i: Int): Pair<Int, Int> {
  val row = i / this.first().size
  val col = i % this.first().size
  return row to col
}