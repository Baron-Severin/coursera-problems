package leetcode.day9

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _40_CombinationSum2KtTest {

  @Test fun one() {
    val input = intArrayOf(10,1,2,7,6,1,5)
    val target = 8
    val expected = setOf(
        setOf(1,7),
        setOf(1,2,5),
        setOf(2,6),
        setOf(1,1,6)
    )
    assertEquals(expected, combinationSum2(input, target).map { it.toSet() }.toSet())
  }

  @Test fun two() {
    val input = intArrayOf(2,5,2,1,2)
    val target = 5
    val expected = setOf(
        setOf(1,2,2),
        setOf(5)
    )
    assertEquals(expected, combinationSum2(input, target).map { it.toSet() }.toSet())
  }
}