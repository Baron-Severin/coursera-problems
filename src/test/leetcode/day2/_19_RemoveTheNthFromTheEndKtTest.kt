package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _19_RemoveTheNthFromTheEndKtTest {

  @Test fun one() {
    val head = ListNode(1)
    var main = head
    for (i in 2..5) {
      main.next = ListNode(i)
      main = main.next as ListNode
    }

    val expectHead = ListNode(1)
    main = expectHead
    for (i in 2..5) {
      if (i == 4) continue
      main.next = ListNode(i)
      main = main.next as ListNode
    }
    assertEquals(expectHead, removeNthFromEnd(head, 2))
  }

  @Test fun two() {
    val head = ListNode(1)
    assertEquals(null, removeNthFromEnd(head, 1))
  }

  @Test fun three() {
    val head = ListNode(1)
    head.next = ListNode(2)
    assertEquals(ListNode(2), removeNthFromEnd(head, 2))
  }

}