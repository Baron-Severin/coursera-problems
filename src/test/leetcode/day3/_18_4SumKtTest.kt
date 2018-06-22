package leetcode.day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _18_4SumKtTest {

  @Test
  fun one() {
    val input = intArrayOf(1,0,-1,0,-2,2)
    val expected = setOf(setOf(-2,-1,1,2),setOf(-2,0,0,2),setOf(-1,0,0,1))
    val returned = fourSum(input, 0).map { it.toSet() }.toSet()
    assertEquals(expected, returned)
  }
}