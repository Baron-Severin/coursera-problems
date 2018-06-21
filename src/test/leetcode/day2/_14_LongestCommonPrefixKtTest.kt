package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _14_LongestCommonPrefixKtTest {

  @Test fun one() {
    assertEquals("", longestCommonPrefix(arrayOf()))
  }

  @Test fun two() {
    assertEquals("fl", longestCommonPrefix(arrayOf("flower","flow","flight")))
  }

  @Test fun three() {
    assertEquals("", longestCommonPrefix(arrayOf("dog","racecar","car")))
  }


}