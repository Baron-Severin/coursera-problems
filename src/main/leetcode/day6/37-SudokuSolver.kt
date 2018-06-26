package leetcode.day6

  // Only partially implemented
  fun solveSudoku(board: Array<CharArray>) {
    // Determine all possibilities for each point
    // Loop over and place all sure points
    // Continue
    // No, won't be enough

    val placements = getPlacements(board)
    val possibilities = getPossibilities(placements)


    val t = ""

  }

val charOptions = (1..9).map { (it + '0'.toInt()).toChar() }
data class SudokuPlacement(val value: Char, val isCertain: Boolean)
data class SudokuPossibilities(val possibilities: List<Char>)

fun getPlacements(board: Array<CharArray>): List<List<SudokuPlacement>> {
  return board.toList()
      .map { inner ->
        inner.map { char ->
          if (char == '.') SudokuPlacement(char, false)
          else SudokuPlacement(char, true)
        }
      }
}

fun getPossibilities(placements: List<List<SudokuPlacement>>): List<List<SudokuPossibilities>> {
  return placements.mapIndexed { row, inner ->
    inner.mapIndexed { col, placement ->
      if (placement.isCertain) listOf(placement.value)
      else {
        val inRow = inRow(placements, row)
        val inColumn = inColumn(placements, col)
        val inBox = inBox(placements, row, col)
        charOptions.filter { !inRow.contains(it) && !inColumn.contains(it) && !inBox.contains(it) }
      }
    }.map { SudokuPossibilities(it) }
  }
}

fun inRow(board: List<List<SudokuPlacement>>, row: Int): Set<Char> {
  return board[row].filter { it.value != '.' }.filter { it.isCertain }.map { it.value }.toSet()
}

fun inColumn(board: List<List<SudokuPlacement>>, column: Int): Set<Char> {
  return board.map { it[column] }.filter { it.value != '.' }.filter { it.isCertain }.map { it.value }.toSet()
}

fun inBox(board: List<List<SudokuPlacement>>, row: Int, column: Int): Set<Char> {
  val boxTop = (row / 3) * 3
  val boxLeft = (column / 3) * 3
  val list = mutableSetOf<Char>()
  for (i in boxTop..boxTop + 2) {
    for (j in boxLeft..boxLeft + 2) {
      list += board[i][j].value
    }
  }
  return list
}
