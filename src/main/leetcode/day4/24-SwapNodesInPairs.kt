package leetcode.day4

import leetcode.day2.ListNode

/**
 * MEDIUM
 * Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.

 */
fun swapPairs(head: ListNode?): ListNode? {
  var head = head
  var slow = head
  var mid = head
  var fast = head?.next
  if (fast != null) {
    val next = fast.next
    fast.next = head
    head?.next = next
    head = fast

    val temp = fast
    fast = mid
    mid = temp
  }
  for (i in 0..1) {
    mid = mid?.next
    fast = fast?.next
  }


  //Given 1->2->3->4, you should return the list as 2->1->4->3.
  while (fast != null) {
    slow?.next = fast
    mid?.next = fast?.next
    fast?.next = mid

    val temp = fast
    fast = mid
    mid = temp

    for (i in 0..1) {
      slow = slow?.next
      mid = mid?.next
      fast = fast?.next
    }
  }
return head
}
