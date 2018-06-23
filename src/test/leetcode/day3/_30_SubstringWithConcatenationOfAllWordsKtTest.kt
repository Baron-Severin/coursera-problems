package leetcode.day3

import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class _30_SubstringWithConcatenationOfAllWordsKtTest {

  @Test fun one() {
    val str = "foobarfoobar"
    val words = arrayOf("foo", "bar")
    val expected = setOf(0, 3, 6)
    assertEquals(expected, findSubstring(str, words).toSet())
    assertEquals(expected, findSubstringSlow(str, words).toSet())
  }

  @Test fun two() {
    val str = "foofoobarbar"
    val words = arrayOf("foo", "foo", "bar")
    val expected = setOf(0)
    assertEquals(expected, findSubstring(str, words).toSet())
    assertEquals(expected, findSubstringSlow(str, words).toSet())
  }

  @Test fun three() {
    val str = "lingmindraboofooowingdingbarrwingmonkeypoundcake"
    val words = arrayOf("fooo","barr","wing","ding","wing")
    val expected = setOf(13)
    assertEquals(expected, findSubstring(str, words).toSet())
  }

  @Test fun four() {
    val str = ""
    val words = arrayOf("fooo","barr","wing","ding","wing")
    val expected = setOf<Int>()
    assertEquals(expected, findSubstring(str, words).toSet())
  }

  @Test fun five() {
    val str = "lingmindraboofooowingdingbarrwingmonkeypoundcake"
    val words = arrayOf<String>()
    val expected = setOf<Int>()
    assertEquals(expected, findSubstring(str, words).toSet())
  }

  @Test fun six() {
    val str = "bacccaa"
    val words = arrayOf("cc","ba")
    val expected = setOf(0)
    assertEquals(expected, findSubstring(str, words).toSet())
  }

  @Test fun speed() {
    val str = "foofoobarbarfoofoobarbarfoofoobarbarfoofoobarbarfoofoobarbarfoofoobarbarfoofoobarbar"
    val words = arrayOf("foo", "foo", "bar","foo", "foo", "bar","foo")
    val expected = setOf<Int>()

    val pattern = "%10s"

    val fast = pattern.format(measureNanoTime {
      assertEquals(expected, findSubstring(str, words).toSet())
    })
    val slow = pattern.format(measureNanoTime {
      assertEquals(expected, findSubstringSlow(str, words).toSet())
    })

    println("Fast: $fast\nSlow: $slow")
    assertTrue { fast < slow }
  }
}