package leetcode.day9

import leetcode.day3.countOccurances

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
  val allCombos = combinationSum(candidates, target)
  val counts = candidates.toList().countOccurances()

  return allCombos.filter { combo ->
    combo.countOccurances().all { it.value <= counts[it.key] ?: Int.MIN_VALUE }
  }
}
