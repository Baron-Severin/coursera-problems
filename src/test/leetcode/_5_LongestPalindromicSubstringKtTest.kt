package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class _5_LongestPalindromicSubstringKtTest {

  @Test
  fun longestPalindrome() {
    assertTrue { "bab" == longestPalindrome("babad") ||
        "aba" == longestPalindrome("babad")
    }
  }
}