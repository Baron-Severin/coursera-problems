package leetcode.day2

data class ListNode(val `val`: Int = 0) {
  var next: ListNode? = null

  override fun equals(other: Any?): Boolean {
    if (other !is ListNode) return false
    return `val` == other.`val` && this.next == other.next
  }

  override fun toString(): String {
    return "$`val` -> " + next.toString()
  }
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
  if (n == 1 && head?.next == null) return null
  var head = head
  var main = head
  var runner = head
  for (i in 0 until n) {
    if (runner?.next == null) {
      head = head?.next
    } else {
      runner = runner.next
    }
  }
  while (runner?.next != null) {
    runner = runner.next
    main = main?.next
  }
  main?.next = main?.next?.next
  return head
}