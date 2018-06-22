package leetcode.day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _22_GenerateParenthesesKtTest {

  @Test fun one() {
    val expect = setOf(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
    )
    assertEquals(expect, generateParenthesis(3).toSet())
  }

  @Test fun two() {
    val expect = setOf(
        "(())",
        "()()"
    )
    assertEquals(expect, generateParenthesis(2).toSet())
  }
}