package leetcode.day11

import java.lang.Math.abs

// Strategy taken from someone else's solution
fun firstMissingPositive(nums: IntArray): Int {
  // If no positive numbers are found, return 1.  Otherwise store any number within the range of valid
  // answers (1..nums.size)
  val pos = nums.firstOrNull { it > 0 && it <= nums.size } ?: return 1
  // Replace all numbers outside of the range 1..nums.size with our stored number
  // That is, normalize the array so that all numbers are within the range 1..nums.size
  for (i in nums.indices) {
    if (nums[i] <= 0 || nums[i] > nums.size) nums[i] = pos
  }
  // For the absolute value of each number N found within nums, make nums[N] negative.
  // E.g., [1,3,1] -> [-1,3,-1].  1 and 3 are in the array, so the first and third buckets are made negative
  for (i in nums.indices) {
    val abs = abs(nums[i])
    nums[abs - 1] = -abs(nums[abs - 1])
  }
  // Find the first positive number (that is, the first index not flagged during the last loop), and return its
  // adjusted value (i.e., 1 indexed rather than 0 indexed)
  // E.g., [-1,3,-1] -> 2.  The 2nd bucket is the first containing a positive number
  for (i in nums.indices) {
    if (nums[i] > 0) return i + 1
  }
  // If we reach this point it means that all numbers between 1..nums.size were found. That means our answer is
  // the next largest, or nums.size + 1
  return nums.size + 1
}



// Rewritten to (maybe?) make this more understandable
fun firstMissingPositiveRewritten(nums: IntArray): Int {
  val positive = firstInRange(nums) ?: return 1
  normalizeToRange(nums, positive)
  flagIndexesAsSeen(nums)
  return firstUnflaggedNumber(nums) ?: nums.size + 1
}

fun firstInRange(nums: IntArray): Int? {
  return nums.firstOrNull { it > 0 && it < nums.size }
}

fun normalizeToRange(nums: IntArray, positive: Int) {
  for (i in nums.indices) {
    if (nums[i] <= 0 || nums[i] > nums.size) nums[i] = positive
  }
}

fun flagIndexesAsSeen(nums: IntArray) {
  for (i in nums.indices) {
    val abs = abs(nums[i])
    nums[abs - 1] = -abs(nums[abs - 1])
  }
}

fun firstUnflaggedNumber(nums: IntArray): Int? {
  for (i in nums.indices) {
    if (nums[i] > 0) return i + 1
  }
  return null
}
