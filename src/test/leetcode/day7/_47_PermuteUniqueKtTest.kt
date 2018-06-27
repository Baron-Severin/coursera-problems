package leetcode.day7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _47_PermuteUniqueKtTest {

  @Test fun one() {
    val input = intArrayOf(1,1,2)
    val expected = listOf(listOf(1,1,2), listOf(1,2,1), listOf(2,1,1))
    assertEquals(expected, permuteUnique(input))
  }
}