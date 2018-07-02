package leetcode.day12

//data class Board(val arr: Array<Array<Boolean>>) {
//  init {
//    println(this)
//  }
//
//  override fun toString(): String {
//    return arr.map { inner -> inner.map { if (it) 'Q' else '.' }.joinToString(separator = "") }
//        .joinToString(separator = "\n")
//  }
//}

val validCombos = mutableListOf<List<String>>()

  fun solveNQueens(n: Int): List<List<String>> {
    validCombos.clear()
    val board = Array(n) { Array(n) { false } }
    recurse(board)
    return validCombos
  }

fun recurse(board: Array<Array<Boolean>>, r: Int = -1, c: Int = -1, count: Int = 0) {
  var count = count
  for (i in board.indices) {
    if (i < r) continue
    for (j in board.indices) {
      if (i == r && j <= c) continue
      if (isOpen(i, j, board)) {
        board[i][j] = true
        count++
        recurse(board, i, j, count)
        if (count == board.size) {
//          Board(board)
          validCombos += board.map { inner -> inner.map { if (it) 'Q' else '.' }.joinToString(separator = "") }
              .toList()
        }
        board[i][j] = false
        count--
      }
    }
  }
}

fun isOpen(row: Int, col: Int, board: Array<Array<Boolean>>): Boolean {
  for (i in board.indices) {
    if (onBoard(row - i, col, board) && board[row - i][col]) return false
    if (onBoard(row + i, col, board) && board[row + i][col]) return false
    if (onBoard(row, col - i, board) && board[row][col - i]) return false
    if (onBoard(row, col + i, board) && board[row][col + i]) return false
    if (onBoard(row + i, col + i, board) && board[row + i][col + i]) return false
    if (onBoard(row + i, col - i, board) && board[row + i][col - i]) return false
    if (onBoard(row - i, col + i, board) && board[row - i][col + i]) return false
    if (onBoard(row - i, col - i, board) && board[row - i][col - i]) return false
  }
  return true
}

fun onBoard(row: Int, col: Int, board: Array<Array<Boolean>>): Boolean {
  if (row < 0 || col < 0) return false
  if (row > board.lastIndex || col > board.lastIndex) return false
  return true
}

