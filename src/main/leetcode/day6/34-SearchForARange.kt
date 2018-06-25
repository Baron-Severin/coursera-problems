package leetcode.day6

fun searchRange(nums: IntArray, target: Int): IntArray {
  return intArrayOf(nums.indexOf(target), nums.indexOfLast { it == target })
}