package leetcode.day1

fun maxArea(height: IntArray): Int {
  var max = 0
  for (i in 0 until height.size) {
    for (j in 0 until height.size) {
      val area = kotlin.math.abs(i - j) * Math.min(height[i], height[j])
      max = Math.max(max, area)
    }
  }
  return max
}
