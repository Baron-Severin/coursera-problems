package leetcode.day2

fun threeSum(nums: IntArray): List<List<Int>> {
  val low = nums.filter { it <= 0 }
  val lowSet = low.toSet()
  val high = nums.filter { it > 0 }
  val highSet = high.toSet()

  return ((findComplements(low, highSet) + findComplements(high, lowSet)).map { it.sorted() }).distinct()
}

fun findComplements(self: List<Int>, set: Set<Int>): Set<List<Int>> {
  val results = mutableSetOf<List<Int>>()
  if (self.count { it == 0 } >= 3) results += listOf(0, 0, 0)
  for (i in 0 until self.size) {
    for (j in 0 until self.size) {
      if (i == j) continue
      val complement = 0 - (self[i] + self[j])
      if (set.contains(complement)) {
        results += listOf(self[i], self[j], complement)
      }
    }
  }
  return results
}
