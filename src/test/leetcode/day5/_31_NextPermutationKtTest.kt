package leetcode.day5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _31_NextPermutationKtTest {

  @Test fun one() {
    val arr = intArrayOf(1,2,3)
    nextPermutation(arr)
    assertEquals(intArrayOf(1,3,2).toList(), arr.toList())
  }

  @Test fun two() {
    val arr = intArrayOf(1,2)
    nextPermutation(arr)
    assertEquals(intArrayOf(2,1).toList(), arr.toList())
  }

}