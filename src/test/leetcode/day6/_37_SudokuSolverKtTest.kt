package leetcode.day6

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _37_SudokuSolverKtTest {

  @Test fun one() {
    val board = arrayOf(
        charArrayOf('.','.','.','.','5','.','.','1','.'),
        charArrayOf('.','4','.','3','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','3','.','.','1'),
        charArrayOf('8','.','.','.','.','.','.','2','.'),
        charArrayOf('.','.','2','.','7','.','.','.','.'),
        charArrayOf('.','1','5','.','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','2','.','.','.'),
        charArrayOf('.','2','.','9','.','.','.','.','.'),
        charArrayOf('.','.','4','.','.','.','.','.','.')
    )
    solveSudoku(board)

  }

  @DisplayName("In Box")
  @Nested inner class InBox {

    @Test fun one() {
      val board = listOf(
          listOf('0','0','0','.','5','.','.','1','.'),
          listOf('0','0','0','3','.','.','.','.','.'),
          listOf('0','0','0','.','.','3','.','.','1'),
          listOf('8','.','.','.','.','.','.','2','.'),
          listOf('.','.','2','.','7','.','.','.','.'),
          listOf('.','1','5','.','.','.','.','.','.'),
          listOf('.','.','.','.','.','2','.','.','.'),
          listOf('.','2','.','9','.','.','.','.','.'),
          listOf('.','.','4','.','.','.','.','.','.')
      ).map { it.map { SudokuPlacement(it, true) } }
      assertEquals(setOf('0','0','0','0','0','0','0','0','0'), inBox(board, 2, 2))
    }

  }

}