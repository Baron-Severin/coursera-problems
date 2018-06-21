package leetcode.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _4_MedianOfTwoSortedArraysKtTest {

  @Test
  fun test() {
    var arr1 = intArrayOf(1, 3)
    var arr2 = intArrayOf(2)
    assertEquals(2.0, findMedianSortedArrays(arr1, arr2))

    arr1 = intArrayOf(1, 3, 5, 7)
    arr2 = intArrayOf(2, 4, 8, 9, 10)
    assertEquals(5.0, findMedianSortedArrays(arr1, arr2))

    arr1 = intArrayOf(1, 3, 5, 7, 8)
    arr2 = intArrayOf(2, 4, 8, 9, 10)
    assertEquals(6.0, findMedianSortedArrays(arr1, arr2))
  }

  @Test fun testMerge() {
    var arr1 = intArrayOf(1, 3)
    var arr2 = intArrayOf(2)
    assertEquals(merge(arr1, arr2).toList(), listOf(1, 2, 3))

    arr1 = intArrayOf(1, 3, 5, 6)
    arr2 = intArrayOf(2, 3)
    assertEquals(merge(arr1, arr2).toList(), listOf(1, 2, 3, 3, 5, 6))
  }
}