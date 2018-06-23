package leetcode.day4

import leetcode.day2.ListNode


/**
 * HARD
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
1->4->5,
1->3->4,
2->6
]
Output: 1->1->2->3->4->4->5->6
 */
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
  if (lists.all { it == null }) return null
  val head = lists.reduce { acc, listNode ->
    if (listNode != null && listNode.`val` < acc?.`val` ?: Int.MAX_VALUE) {
      return@reduce listNode
    } else {
      return@reduce acc
    }
  }
  var current = head
  lists.indexOfFirst { it == head }.let { lists[it] = lists[it]?.next }

  while (lists.any { it != null }) {
    var smallIndex = 0
    for (i in lists.indices) {
      if (lists[i] != null && lists[i]?.`val` ?: Int.MAX_VALUE < lists[smallIndex]?.`val` ?: Int.MAX_VALUE) {
        smallIndex = i
      }
    }
    current!!.next = lists[smallIndex]
    current = current.next
    lists[smallIndex] = lists[smallIndex]!!.next
  }
  return head
}
