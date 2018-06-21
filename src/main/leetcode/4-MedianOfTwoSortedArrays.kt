package leetcode

const val EVEN = 0
const val ODD = 1

class Solution {

  fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    // Find midpoint of each array
    // Binary sort through in tandem
    // If one index increases by 5, the other must decrease by 5
    // If one pointer reaches the end of its collection, add the size of that collection to the other one.  find the middle and go x up/down

    val state = if ((nums1.size + nums2.size) % 2 == 0) EVEN else ODD

    var prev1 : Int? = null
    var prev2 : Int? = null

    var low1 = 0
    var low2 = 0

    var high1 = nums1.size - 1
    var high2 = nums2.size - 1

    while (true) {
      val index1 = getIndex(high1, low1)
      val mid1 = nums1[index1]
      val index2 = getIndex(high2, low2)
      val mid2 = nums2[index2]

      if (mid1 > mid2) {
        if (state == ODD && mid2 < mid1 && mid1 < nums2[index2 + 1]) return mid1.toDouble()
        high1 = index1
        low2 = index2
      } else {
        if (state == ODD && mid1 < mid2 && mid2 < nums1[index1 + 1]) return mid2.toDouble()
        low1 = index1
        high2 = index2
      }
    }


  }

  private fun getIndex(high: Int, low: Int): Int {
    return ((high - low) / 2) + low
  }

}