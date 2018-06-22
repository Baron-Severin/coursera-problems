package leetcode.day2

fun threeSumClosest(nums: IntArray, target: Int): Int {
  var closest = nums[0] + nums[1] + nums[2]
  val nums = nums.sorted()
  for (i in 0 until nums.size) {
    for (j in nums.size -1 downTo 0) {
      if (i == j) continue
      for (k in 0 until nums.size) {
        if (i == k || j == k) continue
        val combined = nums[i] + nums[j] + nums[k]
        if (Math.abs(combined - target) < Math.abs(closest - target)) closest = combined
      }
    }
  }
  return closest
}