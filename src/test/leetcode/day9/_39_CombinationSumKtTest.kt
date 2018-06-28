package leetcode.day9

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _39_CombinationSumKtTest {

  @Test fun one() {
    val input = intArrayOf(2,3,6,7)
    val target = 7
    val expected = setOf(setOf(2,2,3),setOf(7))
    assertEquals(expected, combinationSum(input, target).map { it.toSet() }.toSet())
  }
}