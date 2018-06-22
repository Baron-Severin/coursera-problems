package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class _20_ValidParenthesesKtTest {

  @Test fun one() {
    assertTrue(isValid("()"))
  }

  @Test fun two() {
    assertTrue(isValid("()[]{}"))
  }

  @Test fun three() {
    assertFalse(isValid("(]"))
  }

  @Test fun four() {
    assertFalse(isValid("([)]"))
  }

  @Test fun five() {
    assertTrue(isValid("{[]}"))
  }
}