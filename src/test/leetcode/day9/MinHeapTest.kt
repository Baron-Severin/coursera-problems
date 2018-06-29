package leetcode.day9

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


internal class MinHeapTest {

  lateinit var heap: MinHeap

  @BeforeEach fun setup() {
    heap = MinHeap()
  }

  @Test fun one() {
    heap.add(10)
    heap.add(9)
    assertEquals(9, heap.peek())
    heap.add(3)
    assertEquals(3, heap.peek())
    heap.delete(9)
    assertEquals(3, heap.peek())
    heap.delete(3)
    assertEquals(10, heap.peek())
    heap.add(5)
    heap.add(2)
    assertEquals(2, heap.peek())
  }

  @Test fun two() {
    heap.add(286_789_035)
    heap.add(255_653_921)
    heap.add(274_310_529)
    heap.add(494_521_015)
    assertEquals(255_653_921, heap.peek())
    heap.delete(255_653_921)
    heap.delete(286_789_035)
    assertEquals(274_310_529, heap.peek())
    heap.add(236_295_092)
    heap.add(254_828_111)
    heap.delete(254_828_111)
    heap.add(465_995_753)
    heap.add(85_886_315)
    heap.add(7_959_587)
    heap.add(20_842_598)
    heap.delete(7_959_587)
    assertEquals(20_842_598, heap.peek())
    heap.add(-51_159_108)
    assertEquals(-51_159_108, heap.peek())
    heap.delete(-51_159_108)
    assertEquals(20_842_598, heap.peek())
    heap.add(789_534_713)
  }


}