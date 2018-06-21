package leetcode.day2

/**
 * Given a target currency and an infinite number of coins, what is the fewest
 * number of coins that will add up to the target?
 */
fun coinProblem(coins: List<Int>, target: Int): Int {
  if (target == 0) return 0
  val arr = IntArray(target + 1) { -1 }

  coins.reversed().forEach { coin ->
    if (coin > target) return@forEach
    arr[coin] = 1
    var total = coin + 1
    while (total <= target) {
      if (arr[total - coin] != -1 && (arr[total - coin] + 1 < arr[total] || arr[total] == -1)) {
        arr[total] = arr[total - coin] + 1
      }
      total++
    }
  }
  return arr[target]
}
