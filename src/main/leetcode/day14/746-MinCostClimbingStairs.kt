package leetcode.day14

import kotlin.math.min

  fun minCostClimbingStairs(cost: IntArray): Int {
    if (cost.size < 3) {
      val first = if (cost.size >= 1) cost[0] else 0
      val second = if (cost.size >= 2) cost[1] else 0
      return min(first, second)
    }
    val dp = IntArray(cost.size)
    dp[0] = cost[0]
    dp[1] = cost[1]
    for (i in 2..cost.lastIndex) {
      dp[i] = min(dp[i - 1] + cost[i], dp[i - 2] + cost[i])
    }
    return min(dp.last(), dp[dp.lastIndex - 1])
  }
