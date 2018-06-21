package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _279_PerfectSquaresKtTest {

  @Test
  fun one() {
    assertEquals(3, numSquares(12))
  }

  @Test fun two() {
    assertEquals(2, numSquares(13))
  }

  @Test fun three() {
    assertEquals(2, numSquares(2))
  }

  @Test fun four() {
    assertEquals(1, numSquares(1))
  }

  @Test fun five() {
    assertEquals(3, numSquares(56))
  }
}