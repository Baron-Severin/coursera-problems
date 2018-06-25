package leetcode.day5

fun nextPermutation(nums: IntArray): Unit {
  var largestX = -1
  for (i in nums.indices) {
    if (i < nums.size - 1 && nums[i] < nums[i + 1]) largestX = i
  }
  if (largestX == -1) {
    nums.sort()
    return
  }
  var largestY = -1
  for (i in nums.indices) {
    if (nums[largestX] < nums[i]) largestY = i
  }
  val temp = nums[largestX]
  nums[largestX] = nums[largestY]
  nums[largestY] = temp

  val afterSize = nums.lastIndex - largestX
  for (i in 0..afterSize) {
    val temp = nums[i + largestX]
    nums[i + largestX] = nums[nums.lastIndex - i]
    nums[nums.lastIndex - i] = temp
  }
}