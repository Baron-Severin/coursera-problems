package leetcode.day4

import leetcode.day3.toNodes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _24_SwapNodesInPairsKtTest {

  @Test fun one() {
    val input = listOf(1,2,3,4).toNodes()
    val expect = listOf(2,1,4,3).toNodes()
    assertEquals(expect, swapPairs(input))
  }

  @Test fun two() {
    val input = listOf(1,2,3,4,5).toNodes()
    val expect = listOf(2,1,4,3,5).toNodes()
    assertEquals(expect, swapPairs(input))
  }
}