package leetcode.day4

import leetcode.day2.ListNode
import leetcode.day3.toNodes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _25_ReverseNodesInKGroupKtTest {

  @Test fun one() {
    val start = listOf(2, 3, 4, 5).toNodes()
    val before = listOf(1).toNodes()
    val after = listOf(5).toNodes()
    val expected = listOf(4,3,2,1).toNodes()
    assertEquals(expected, reverseGroup(before, start, after))
  }

  @Test fun two() {
    val start = listOf(2, 3, 4, 5).toNodes()
    val before : ListNode? = null
    val after = listOf(5).toNodes()
    val expected = listOf(4,3,2).toNodes()
    assertEquals(expected, reverseGroup(before, start, after))
  }



}