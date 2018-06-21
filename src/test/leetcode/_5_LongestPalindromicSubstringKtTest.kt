package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class _5_LongestPalindromicSubstringKtTest {

  @Test
  fun longestPalindrome() {
    assertTrue { "bab" == longestPalindrome("babad") ||
        "aba" == longestPalindrome("babad")
    }
    assertEquals("ccc", longestPalindrome("ccc"))
    assertEquals("a", longestPalindrome("a"))
  }
}