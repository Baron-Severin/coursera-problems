package leetcode.day16

fun maxProduct(nums: IntArray): Int {
  if (nums.isEmpty()) return 0
  var biggest = nums[0]
  var lastLow = nums[0]
  var lastHigh = nums[0]

  for (i in 1..nums.lastIndex) {
    val num = nums[i]
    val timesHigh = lastHigh * num
    val timesLow = lastLow * num
    val all = listOf(num, timesHigh, timesLow)
    lastHigh = all.max() ?: 0
    lastLow = all.min() ?: 0
    if (lastHigh > biggest) biggest = lastHigh
  }
  return biggest
}

