package leetcode.day7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _46_PermutationsKtTest {

  @Test fun one() {
    val input = intArrayOf(1,2,3)
    val expected = listOf(listOf(1,2,3),listOf(1,3,2),listOf(2,1,3),listOf(2,3,1),listOf(3,1,2),listOf(3,2,1))
    assertEquals(expected, permute(input))
  }

}