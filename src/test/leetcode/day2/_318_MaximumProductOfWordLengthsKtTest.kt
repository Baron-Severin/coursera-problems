package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _318_MaximumProductOfWordLengthsKtTest {

  @Test fun one() {
    assertEquals(16, maxProduct(arrayOf("abcw","baz","foo","bar","xtfn","abcdef")))
  }

  @Test fun two() {
    assertEquals(4, maxProduct(arrayOf("a","ab","abc","d","cd","bcd","abcd")))
  }

  @Test fun three() {
    assertEquals(0, maxProduct(arrayOf("a","aa","aaa","aaaa")))
  }
}