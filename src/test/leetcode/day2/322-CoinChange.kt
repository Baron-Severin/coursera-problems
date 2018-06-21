package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class `322-CoinChange` {

  @Test fun one() {
    assertEquals(3, coinProblem(listOf(1, 2, 5), 11))
  }

  @Test fun two() {
    assertEquals(-1, coinProblem(listOf(2), 3))
  }

  @Test fun three() {
    assertEquals(2, coinProblem(listOf(1, 3, 5), 8))
  }

  @Test fun four() {
    assertEquals(0, coinProblem(listOf(1), 0))
  }

  @Test fun five() {
    assertEquals(-1, coinProblem(listOf(2), 1))
  }
}