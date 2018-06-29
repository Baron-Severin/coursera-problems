package leetcode.day10

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HackerEarth_NQueensKtTest {

  @Test fun one() {
    val board = Array(4) { Array(4) { false} }
    assertEquals(true, iterate(board))
  }
}