package leetcode.day4

import leetcode.day2.ListNode

/**
 * HARD
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

Example:

Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

Note:

Only constant extra memory is allowed.
You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
  if (k < 2) return head
  var newHead: ListNode? = null
  var prev: ListNode? = null
  var first = head
  var last = head
  var ahead : ListNode?
  while (first != null) {
    for (i in 1 until k) {
      last = last?.next
    }
    if (newHead == null) newHead = last ?: first
    ahead = last?.next
    if (reverseGroup(first, last)) {
      prev?.next = last
      prev = first
      first.next = ahead
      first = ahead
      last = ahead
    } else {
      prev?.next = first
      break
    }
  }
  return newHead
}

fun reverseGroup(first: ListNode?, last: ListNode?): Boolean {
  if (last == null) return false
  var prev = first
  var current = first?.next
  while (current != last) {
    val temp = current?.next
    current?.next = prev
    prev = current
    current = temp
  }
  last.next = prev
  return true
}


