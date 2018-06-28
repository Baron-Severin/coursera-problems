package leetcode.day9

  fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val candidates = candidates.toSet()
    val combos = List<MutableSet<List<Int>>>(target + 1) { mutableSetOf() }
    candidates.forEach { if (it <= target) combos[it] += listOf(it) }

    for (i in 2..target) {
      val diffs = candidates.filter { i - it > 0 && combos[i - it].isNotEmpty() }
      diffs.forEach { diff ->
        combos[i - diff].forEach { list ->
          combos[i] += (list + diff).sorted()
        }
      }
    }
    return combos[target].map { it.toList() }
  }
