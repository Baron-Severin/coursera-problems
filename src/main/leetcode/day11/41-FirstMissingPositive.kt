package leetcode.day11

data class CountSum(val count: Int = 0, val sum: Int = 0)

fun firstMissingPositive(nums: IntArray): Int {
  var changesMade = true
  var count = nums.size
  while (changesMade) {
    changesMade = false
    for (i in 0 until count) {
      if (i >= count) break
      if (nums[i] <= 0 || nums[i] > count) {
        changesMade = true
        val temp = nums[i]
        nums[i] = nums[count - 1]
        nums[count - 1] = temp
        count--
      }
    }
  }
  if (count == 0) return 1
  var sum = 0
  for (i in 0 until count) {
    sum += nums[i]
  }
  val expect = ((count + 1) * (count + 2)) / 2
  return expect - sum
}