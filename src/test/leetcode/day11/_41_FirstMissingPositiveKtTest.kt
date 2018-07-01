package leetcode.day11

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _41_FirstMissingPositiveKtTest {

  @Test fun one() {
    val input = intArrayOf(7,8,9,11,12)
    assertEquals(1, firstMissingPositive(input))
  }

  @Test fun two() {
    val input = intArrayOf(1,2,0)
    assertEquals(3, firstMissingPositive(input))
  }

  @Test fun three() {
    val input = intArrayOf(3,4,-1,1)
    assertEquals(2, firstMissingPositive(input))
  }

  @Test fun four() {
    val input = intArrayOf(7,8,9,11,12)
    assertEquals(1, firstMissingPositive(input))
  }

  @Test fun five() {
    val input = intArrayOf(1,1)
    assertEquals(2, firstMissingPositive(input))
  }
}