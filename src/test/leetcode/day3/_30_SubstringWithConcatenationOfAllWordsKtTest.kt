package leetcode.day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _30_SubstringWithConcatenationOfAllWordsKtTest {

  @Test fun one() {
    val str = "foobarfoobar"
    val words = arrayOf("foo", "bar")
    val expected = setOf(0, 3, 6)
    assertEquals(expected, findSubstring(str, words).toSet())
  }
}