package leetcode.day6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _36_ValidSudokuKtTest {

  @Test fun one() {
    val board = arrayOf(
      charArrayOf('5','3','.','.','7','.','.','.','.'),
      charArrayOf('6','.','.','1','9','5','.','.','.'),
      charArrayOf('.','9','8','.','.','.','.','6','.'),
      charArrayOf('8','.','.','.','6','.','.','.','3'),
      charArrayOf('4','.','.','8','.','3','.','.','1'),
      charArrayOf('7','.','.','.','2','.','.','.','6'),
      charArrayOf('.','6','.','.','.','.','2','8','.'),
      charArrayOf('.','.','.','4','1','9','.','.','5'),
      charArrayOf('.','.','.','.','8','.','.','7','9')
    )
    assertEquals(true, isValidSudoku(board))
  }
  
  @Test fun two() {
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
    assertEquals(false, isValidSudoku(board))
  }  
  
  @Test fun three() {
    val board = arrayOf(
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.'),
      charArrayOf('.','.','.','.','.','.','.','.','.')
    )
    assertEquals(true, isValidSudoku(board))
  }
  
  
  
}