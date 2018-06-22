package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _15_3SumKtTest {

  @Test fun one() {
    assertEquals(setOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), threeSum(intArrayOf(-1,0,1,2,-1,-4)).s())
  }

  @Test fun two() {
    assertEquals(setOf(), threeSum(intArrayOf(0,0)).s())
  }

  @Test fun three() {
    assertEquals(setOf(listOf(0,0,0)), threeSum(intArrayOf(0,0,0)).s())
  }

  @Test fun four() {
    assertEquals(setOf(listOf(0,0,0)), threeSum(intArrayOf(0,0,0,0)).s())
  }

}




private fun List<List<Int>>.s(): Set<List<Int>> {
  return this.toSet()
}