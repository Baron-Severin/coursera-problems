package leetcode.day3

import leetcode.day2.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _21_MergeTwoSortedListsKtTest {

  @Test fun one() {
    val zip1 = listOf(1, 2, 4).toNodes()
    val zip2 = listOf(1, 3, 4).toNodes()
    val expect = listOf(1, 1, 2, 3, 4, 4).toNodes()
    assertEquals(expect, mergeTwoLists(zip1, zip2))
  }
}

fun List<Int>.toNodes(): ListNode? {
  if (this.isEmpty()) return null
  val head = ListNode(this[0])
  var current : ListNode? = head
  for (i in 1..this.lastIndex) {
    current?.next = ListNode(this[i])
    current = current?.next
  }
  return head
}