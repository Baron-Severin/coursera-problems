package leetcode.day6

// Contains only digits 1-9 and .
// No repeated digits
// Rows don't add to more than

  fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in board.indices) {
      val list = getRowList(board, i)
      if (containsDuplicates(list)) return false
    }
    for (i in board[0].indices) {
      val list = getColumnList(board, i)
      if (containsDuplicates(list)) return false
    }
    val boxes = listOf(
        boxCoord(0 to 0),
        boxCoord(0 to 3),
        boxCoord(0 to 6),
        boxCoord(3 to 0),
        boxCoord(3 to 3),
        boxCoord(3 to 6),
        boxCoord(6 to 0),
        boxCoord(6 to 3),
        boxCoord(6 to 6)
    )
    boxes.map { pair -> getBoxList(board, pair.first, pair.second) }
        .forEach { list -> if (containsDuplicates(list)) return false }
    return true
  }

fun boxCoord(topLeft: Pair<Int, Int>): Pair<Pair<Int, Int>, Pair<Int, Int>> {
  return topLeft to (topLeft.first + 2 to topLeft.second + 2)
}

fun getBoxList(board: Array<CharArray>, topLeft: Pair<Int, Int>, botRight: Pair<Int,Int>): List<Char> {
  val charList = mutableListOf<Char>()
  for (i in topLeft.first..botRight.first) {
    for (j in topLeft.second..botRight.second) {
      charList += board[i][j]
    }
  }
  return charList
}

fun getRowList(board: Array<CharArray>, row: Int): List<Char> {
  val charList = mutableListOf<Char>()
  for (i in board[row].indices) {
    charList += board[row][i]
  }
  return charList
}

fun getColumnList(board: Array<CharArray>, column: Int): List<Char> {
  val charList = mutableListOf<Char>()
  for (i in board.indices) {
    charList += board[i][column]
  }
  return charList
}

fun containsDuplicates(list: List<Char>): Boolean {
  val filteredList = list.filter { it != '.' }
  return filteredList.size != filteredList.toSet().size
}


