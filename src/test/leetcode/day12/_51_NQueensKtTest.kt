package leetcode.day12

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _51_NQueensKtTest {

  @Test fun one() {
    val expected = listOf(
      listOf(".Q..",
        "...Q",
        "Q...",
        "..Q."),

      listOf("..Q.",
        "Q...",
        "...Q",
        ".Q..")
    )
    assertEquals(expected, solveNQueens(4))
  }


}