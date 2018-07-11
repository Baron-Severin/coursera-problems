package leetcode.day20

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class _74_SearchA2DMatrixKtTest {

  @Test fun one() {
    val matrix = arrayOf(intArrayOf(1,3,5,7),intArrayOf(10,11,16,20),intArrayOf(23,30,34,50))
    val target = 13
    assertEquals(false, searchMatrix(matrix, target))
  }

  @Test fun two() {
    val matrix = arrayOf(intArrayOf(1,3,5,7),intArrayOf(10,11,16,20),intArrayOf(23,30,34,50))
    val target = 3
    assertEquals(true, searchMatrix(matrix, target))
  }

  @Test fun three() {
    val matrix = arrayOf(intArrayOf(1))
    val target = 2
    assertEquals(false, searchMatrix(matrix, target))
  }

}