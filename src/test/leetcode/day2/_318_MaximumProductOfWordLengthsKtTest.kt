package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class _318_MaximumProductOfWordLengthsKtTest {

  @Test fun one() {
    assertEquals(16, maxProduct(arrayOf("abcw","baz","foo","bar","xtfn","abcdef")))
    assertEquals(16, maxProductSlow(arrayOf("abcw","baz","foo","bar","xtfn","abcdef")))
  }

  @Test fun two() {
    assertEquals(4, maxProduct(arrayOf("a","ab","abc","d","cd","bcd","abcd")))
    assertEquals(4, maxProductSlow(arrayOf("a","ab","abc","d","cd","bcd","abcd")))
  }

  @Test fun three() {
    assertEquals(0, maxProduct(arrayOf("a","aa","aaa","aaaa")))
    assertEquals(0, maxProductSlow(arrayOf("a","aa","aaa","aaaa")))
  }

  @Test fun time() {
    val values = arrayOf("abcw","baz","foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn","abcdef","abcw",
        "baz","foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn",
        "abcdef","abcw","baz","foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn","abcdef","abcw","baz",
        "foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn","abcdef","abcw","baz","foo","bar","xtfn",
        "abcdef","abcw","baz","foo","bar","xtfn","abcdef")
    val pattern = "%10d"
    val slow = pattern.format(measureNanoTime {
      maxProductSlow(values)
    })
    val fast = pattern.format(measureNanoTime {
      maxProduct(values)
    })
    println("Slow: $slow\nFast: $fast")
    assertTrue { slow > fast }
  }
}