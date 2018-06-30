package leetcode.day10

// https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/tutorial/
fun main(vararg args: String) {
  val n = readLine()?.toInt() ?: 0
  val board = Array(n) { Array(n) { false } }
  if (iterate(board)) {
    println("YES")
    for (i in board) {
      println(i.map { if (it) "1" else "0" }.joinToString(separator = " "))
    }
  } else {
    println("NO")
  }
}

class Debug(board: Array<Array<Boolean>>) {
  init {
    println("\n")
    board.forEach { println(it.joinToString(separator = " ") { if (it) "1" else "0" }) }
    println("\n")
  }
}

fun iterate(board: Array<Array<Boolean>>, lastRow: Int = 0, lastCol: Int = -1): Boolean {
  val queens = board.size
  if (board.flatMap { it.filter { it } }.count() == queens) return true
  for (i in lastRow..board.lastIndex) {
    for (j in 0..board.lastIndex) {
      if (i == lastRow && j <= lastCol) continue
      if (isAttacked(i, j, board)) continue
      board[i][j] = true
      if (iterate(board, i, j)) return true
      board[i][j] = false
    }
  }
  return false
}

fun isAttacked(row: Int, col: Int, board: Array<Array<Boolean>>): Boolean {
  val nums = (0 until board.size)
  val attackers = nums.map { row to it } +
      nums.map { it to col } +
      (0..board.size)
          .flatMap { setOf((row + it to col + it), (row - it to col - it), (row - it to col + it), (row + it to col - it)) }
          .filter { it.first < board.size &&
              it.second < board.size &&
              it.first >= 0 &&
              it.second >= 0 }
  return attackers.any { board[it.first][it.second] }
}
