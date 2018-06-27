package leetcode.day7

  fun permuteUnique(nums: IntArray, base: List<List<Int>> = emptyList()): List<List<Int>> {
    if (nums.isEmpty()) return base
    return nums.toSet().flatMap { int ->
      val intIndex = nums.indexOf(int)
      val newNums = nums.filterIndexed { index, _ -> index != intIndex }.toIntArray()
      val newBase = if (base.isEmpty()) listOf(listOf(int))
      else base.map { it + int }
      permuteUnique(newNums, newBase)
    }
  }
