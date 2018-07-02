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

  @Test fun two() {
    val expected = listOf(listOf("Q"))
    assertEquals(expected, solveNQueens(1))
  }

  @Test fun three() {
    assertEquals(10, solveNQueens(5).size)
  }
  
  @Test fun four() {
    val expected = listOf(
        listOf("Q....","..Q..","....Q",".Q...","...Q."),
        listOf("Q....","...Q.",".Q...","....Q","..Q.."),
        listOf(".Q...","...Q.","Q....","..Q..","....Q"),
        listOf(".Q...","....Q","..Q..","Q....","...Q."),
        listOf("..Q..","Q....","...Q.",".Q...","....Q"),
        listOf("..Q..","....Q",".Q...","...Q.","Q...."),
        listOf("...Q.","Q....","..Q..","....Q",".Q..."),
        listOf("...Q.",".Q...","....Q","..Q..","Q...."),
        listOf("....Q",".Q...","...Q.","Q....","..Q.."),
        listOf("....Q","..Q..","Q....","...Q.",".Q...")
    )
    val t = solveNQueens(5)
    println(t.filter { !expected.contains(it) }.toReadable())

    assertEquals(expected, solveNQueens(5))
  }


}

private fun List<List<String>>.toReadable(): String {
  return this.map { it.map { it.map { if (it == 'Q') '+' else '-' }.joinToString(separator = " ") }.joinToString(separator = "\n") }.joinToString(separator = "\n\n")
}