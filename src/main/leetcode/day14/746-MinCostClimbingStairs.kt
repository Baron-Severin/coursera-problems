package leetcode.day14

import kotlin.math.min

  fun minCostClimbingStairs(cost: IntArray): Int {
    var old = 0
    var new = 0
    for (i in cost.indices) {
      val temp = min(old + cost[i], new + cost[i])
      old = new
      new = temp
    }
    return min(old, new)
  }
