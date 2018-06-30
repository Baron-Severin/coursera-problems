package leetcode.day10

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HeapSortTest {

  @Nested class MinHeap {

    @Test fun one() {
      val heap = MinHeap<Int>()
      assertEquals(null, heap.peek())
      assertEquals(null, heap.poll())
      heap.add(5)
      assertEquals(5, heap.peek())
      heap.add(10)
      assertEquals(5, heap.peek())
      heap.add(3)
      assertEquals(3, heap.poll())
      assertEquals(5, heap.peek())
      for (i in 0..30 step 5) {
        heap.add(i)
      }
      assertEquals(0, heap.poll())
      assertEquals(5, heap.poll())
      assertEquals(5, heap.poll())
    }

  }


}