package leetcode.day3

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
  val nums = nums.sorted()
  val solutions = mutableSetOf<List<Int>>()
  for (i in nums.indices) {
    for (j in i + 1 until nums.size) {
      var left = j + 1
      var right = nums.lastIndex
      while (left < right) {
        val solution = listOf(nums[i], nums[j], nums[left], nums[right])
        val sum = solution.reduce { acc, next -> acc + next }
        when {
          sum == target -> {
            solutions += solution
            left++
            right--
          }
          sum > target -> right--
          sum < target -> left++
        }
      }
    }
  }
  return solutions.toList()
}