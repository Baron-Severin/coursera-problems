package leetcode.day18

fun canJump(nums: IntArray): Boolean {
  return canReachIndex(nums)
}

fun canReachIndex(nums: IntArray, target: Int = nums.lastIndex): Boolean {
  if (target == 0) return true
  var earliest = -1
  for (i in target - 1 downTo 0) {
    if (i + nums[i] >= target) earliest = i
  }
  if (earliest == -1) return false
  return canReachIndex(nums, earliest)
}