package leetcode.day6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _32_LongestValidParenthesesKtTest {

  @Test fun one() {
    assertEquals(2, longestValidParentheses("(()"))
  }

  @Test fun two() {
    assertEquals(4, longestValidParentheses(")()())"))
  }

  @Test fun three() {
    assertEquals(0, longestValidParentheses(""))
  }

  @Test fun four() {
    assertEquals(0, longestValidParentheses("("))
  }
}