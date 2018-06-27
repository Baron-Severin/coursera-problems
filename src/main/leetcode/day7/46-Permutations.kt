package leetcode.day7

fun permute(nums: IntArray, base: List<List<Int>> = emptyList()): List<List<Int>> {
  if (nums.isEmpty()) return base
  return nums.toList().flatMap { int ->
    val newNums = nums.filter { it != int }.toIntArray()
    val newBase = if (base.isEmpty()) listOf(listOf(int))
                  else base.map { it + int }
    permute(newNums, newBase)
  }
}
