package leetcode.day13

import kotlin.math.max


fun maxSubArray(nums: IntArray): Int {
  val dp = IntArray(nums.size)
  for (i in nums.indices) {
    val last = if (i != 0) dp[i - 1] else 0
    dp[i] = max(last + nums[i], nums[i])
  }
  return dp.max() ?: 0
}

 // o(n) solution
//  fun maxSubArray(nums: IntArray): Int {
//    var maxSize = Int.MIN_VALUE
//    var currSize = nums[0]
//    var rightIndex = -1
//    for (i in nums.indices) {
//      currSize += nums[i]
//      if (currSize > maxSize) {
//        maxSize = currSize
//        rightIndex = i
//      }
//    }
//
//    maxSize = Int.MIN_VALUE
//    currSize = nums[rightIndex]
//    var leftIndex = -1
//    for (i in rightIndex downTo 0) {
//      currSize += nums[i]
//      if (currSize > maxSize) {
//        maxSize = currSize
//        leftIndex = i
//      }
//    }
//    return nums.toList().subList(leftIndex, rightIndex + 1).sum()
//  }
