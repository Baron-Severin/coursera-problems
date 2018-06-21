package leetcode.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _10_RegularExpressionMatchingKtTest {

  @Test
  fun one() {
    assertEquals(false, isMatch("aa", "a"))
  }

  @Test fun two() {
    assertEquals(true, isMatch("aa", "a*"))
  }

  @Test fun three() {
    assertEquals(true, isMatch("ab", ".*"))
  }


  @Test fun four() {
    assertEquals(true, isMatch("aab", "c*a*b"))
  }

  @Test fun five() {
    assertEquals(false, isMatch("mississippi", "mis*is*p*."))
  }

  @Test fun six() {
    assertEquals(true, isMatch("a", "ab*"))
  }

  @Test fun seven() {
    assertEquals(true, isMatch("bbbba", ".*a*a"))
  }

  @Test fun eight() {
    assertEquals(true, isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*a*a*b"))
  }
}