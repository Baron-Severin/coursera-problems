package leetcode.day5

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Search In Rotated Sorted Array")
internal class _33_SearchInRotatedSortedArrayKtTest {

  @Nested inner class Search {

    @Test fun one() {
      val arr = intArrayOf(4,5,6,1,2,3)
      val target = 2
      val expected = 4
      assertEquals(expected, search(arr, target))
    }

    @Test fun two() {
      val arr = intArrayOf(4,5,6,1,2,3)
      val target = 99
      val expected = -1
      assertEquals(expected, search(arr, target))
    }

    @Test fun three() {
      val arr = intArrayOf(4,5,6,7,0,1,2)
      val target = 0
      val expected = 4
      assertEquals(expected, search(arr, target))
    }

    @Test fun four() {
      val arr = intArrayOf(1)
      val target = 0
      val expected = -1
      assertEquals(expected, search(arr, target))
    }

//    @Test fun five() {
//      val arr = intArrayOf(1,3)
//      val target = 0
//      val expected = -1
//      assertEquals(expected, search(arr, target))
//    }

  }

  @DisplayName("Find Pivot")
  @Nested inner class FindPivot {

    @Test fun one() {
      val arr = intArrayOf(4,5,6,7,0,1,2)
      val pivot = 4
      assertEquals(pivot, findPivot(arr, 0))
    }

    @Test fun two() {
      val arr = intArrayOf(11,12,1,2,3,4,5,6,7,8,9,10)
      val pivot = 2
      assertEquals(pivot, findPivot(arr, 0))
    }

  }

  @DisplayName("Midpoint Between")
  @Nested inner class MidpointBetween {

    @Test fun one() {
      // 4,5,1,2,3
      val high = 1
      val low = 2
      val pivot = 2
      val arrSize = 5
      val midpoint = 4
      assertEquals(midpoint, midpointBetween(low, high, pivot, arrSize))
    }

    @Test fun two() {
      // 4,5,6,7,8,9,1,2,3
      val high = 5
      val low = 6
      val pivot = 6
      val arrSize = 9
      val midpoint = 2
      assertEquals(midpoint, midpointBetween(low, high, pivot, arrSize))
    }

    @Test fun three() {
      // 4,5,1,2,3
      val high = 4
      val low = 2
      val pivot = 2
      val arrSize = 5
      val midpoint = 3
      assertEquals(midpoint, midpointBetween(low, high, pivot, arrSize))
    }



  }
}