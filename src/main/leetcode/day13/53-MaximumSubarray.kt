package leetcode.day13

  fun maxSubArray(nums: IntArray): Int {
    var maxSize = Int.MIN_VALUE
    var currSize = 0
    var rightIndex = -1
    for (i in nums.indices) {
      currSize += nums[i]
      if (currSize > maxSize) {
        maxSize = currSize
        rightIndex = i
      }
    }

    maxSize = 0
    currSize = 0
    var leftIndex = -1
    for (i in rightIndex downTo 0) {
      currSize += nums[i]
      if (currSize > maxSize) {
        maxSize = currSize
        leftIndex = i
      }
    }
    return nums.toList().subList(leftIndex, rightIndex + 1).sum()
  }