package leetcode.day4

import kotlin.math.abs

fun searchInsert(nums: IntArray, target: Int): Int {
  val indexOf = nums.indexOf(target)
  if (indexOf != -1) return indexOf
  return abs(nums.binarySearch(target)) - 1
}