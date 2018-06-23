package leetcode.day4

import leetcode.day3.toNodes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _25_ReverseNodesInKGroupKtTest {

  @Test fun one() {
    val start = listOf(1,2,3,4,5,6).toNodes()
    val end = {
      var last = start
      while(last?.next != null) last = last.next
      last
    }()
    val expected = listOf(6,5,4,3,2,1).toNodes()
    reverseGroup(start, end)
    start?.next = null
    assertEquals(expected, end)
  }

  @Test fun two() {
    val start = listOf(1,2,3,4,5,6,7,8).toNodes()
    val expected = listOf(2,1,4,3,6,5,8,7).toNodes()
    assertEquals(expected, reverseKGroup(start, 2))
  }

  @Test fun three() {
    val start = listOf(1,2,3,4,5,6,7,8).toNodes()
    val expected = listOf(3,2,1,6,5,4,7,8).toNodes()
    assertEquals(expected, reverseKGroup(start, 3))
  }

  @Test fun four() {
    val start = listOf(1,2,3,4,5).toNodes()
    val expected = listOf(1,2,3,4,5).toNodes()
    assertEquals(expected, reverseKGroup(start, 1))
  }

  @Test fun five() {
    val start = listOf(1).toNodes()
    val expected = listOf(1).toNodes()
    assertEquals(expected, reverseKGroup(start, 2))
  }

}