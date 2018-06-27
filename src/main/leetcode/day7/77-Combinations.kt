package leetcode.day7

// Too slow
  fun combine(n: Int, k: Int): List<List<Int>> {
    val nums = (1..n).toList()
    val base = nums.dropLast(k - 1).map { listOf(it) }
    return add(nums.drop(1), k - 1, base)
        .map { it.toSet() }
        .toSet()
        .map { it.toList() }
  }

fun add(nums: List<Int>, add: Int, base: List<List<Int>>): List<List<Int>> {
  if (add == 0) return base
  val newBase = base.flatMap { subList -> nums.map { num ->
    if (!subList.contains(num)) subList + num else emptyList()}
  }.filter { it.isNotEmpty() }
  return add(nums.drop(1), add - 1, newBase)
}
