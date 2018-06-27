package leetcode.day7

// Too slow
fun combine(n: Int, k: Int): List<List<Int>> {
  val nums = (1..n).toList()
  return allCombos(nums, k)
}

fun allCombos(nums: List<Int>, add: Int): List<List<Int>> {
  if (add == 0) return emptyList()
  val base = nums.map { listOf(it) }
  return add(nums, add - 1, base)
      .map { it.toSet() }
      .toSet()
      .filter { it.size == add }
      .map { it.toList() }
}

fun add(nums: List<Int>, add: Int, base: List<List<Int>>): List<List<Int>> {
  if (add == 0) return base
  return add(nums, add - 1, base.flatMap { base ->  nums.map { num -> base + num } })
}


