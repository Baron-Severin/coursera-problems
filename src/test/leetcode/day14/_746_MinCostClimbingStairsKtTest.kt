package leetcode.day14

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _746_MinCostClimbingStairsKtTest {

  @Test fun one() {
    val input = intArrayOf(10, 15, 20)
    val output = 15
    assertEquals(output, minCostClimbingStairs(input))
  }

  @Test fun two() {
    val input = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
    val output = 6
    assertEquals(output, minCostClimbingStairs(input))
  }



}