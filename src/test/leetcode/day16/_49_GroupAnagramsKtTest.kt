package leetcode.day16

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _49_GroupAnagramsKtTest {

  @Test fun one() {
    val input = arrayOf("eat","tea","tan","ate","nat","bat")
    val output = setOf(setOf("bat"),setOf("nat","tan"),setOf("ate","eat","tea"))
    assertEquals(output, groupAnagrams(input).map { it.toSet() }.toSet())
  }

  @Test fun two() {
    val input = arrayOf("bob", "boo", "ba")
    val output = setOf(setOf("ba"),setOf("bob"),setOf("boo"))
    assertEquals(output, groupAnagrams(input).map { it.toSet() }.toSet())
  }

}