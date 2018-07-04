package leetcode.day13

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _53_MaximumSubarrayKtTest {

  @Test fun one() {
    val input = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    val expected = 6
    assertEquals(expected, maxSubArray(input))
  }
  
  @Test fun two() {
    val input = intArrayOf(-1)
    val expected = -1
    assertEquals(expected, maxSubArray(input))
  }
  
}