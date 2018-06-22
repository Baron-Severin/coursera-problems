package leetcode.day3

import leetcode.day2.ListNode

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
  var l1 = l1
  var l2 = l2
  val head : ListNode?
  if (l1?.`val` ?: Int.MAX_VALUE < l2?.`val` ?: Int.MAX_VALUE) {
    head = l1
    l1 = l1?.next
  } else {
    head = l2
    l2 = l2?.next
  }
  var current = head

  while (l1 != null || l2 != null) {
    if (l1?.`val` ?: Int.MAX_VALUE < l2?.`val` ?: Int.MAX_VALUE) {
      current?.next = l1
      current = current?.next
      l1 = l1?.next
    } else {
      current?.next = l2
      current = current?.next
      l2 = l2?.next
    }
  }
  return head
}
