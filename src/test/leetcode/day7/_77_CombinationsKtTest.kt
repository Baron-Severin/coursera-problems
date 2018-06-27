package leetcode.day7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _77_CombinationsKtTest {

  @Test fun one() {
    val input = listOf(1,2,3)
    val more = 2
    val expected = listOf(
        listOf(1,2),
        listOf(1,3),
        listOf(2,3)
    )

    assertEquals(expected, allCombos(input, more))
  }

  @Test fun two() {
    val n = 3
    val k = 2
    val expected = listOf(
        listOf(1,2),
        listOf(1,3),
        listOf(2,3)
    )
    assertEquals(expected, combine(n, k))
  }

  @Test fun three() {
    val n = 4
    val k = 2
    val expected = listOf(
      listOf(2,4),
      listOf(3,4),
      listOf(2,3),
      listOf(1,2),
      listOf(1,3),
      listOf(1,4)
    )
    assertEquals(expected.toSet(), combine(n, k).toSet())
  }
}