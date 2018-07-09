package leetcode.day19

fun minSteps(n: Int): Int {
  return when (n) {
    // We start with A, so it takes 0 steps to reach 1
    1 -> 0
    else -> {
      // When possible, pasting more characters at a time will always result in fewer operations.
      // Therefore, iterate down and use first (that is, largest) valid number
      for (i in n - 1 downTo 2) {
        // If our target is divided cleanly by this number...
        if (n % i == 0) {
          // Add n / i to our total (1 operation to copy, paste n - 1 times [A -> AAA == copy paste paste])
          // Combine the above value with the operations required to reach this number
          return n / i + minSteps(i)
        }
      }
      // Nothing else divides cleanly, so we will need n steps (copy A once, then paste n - 1 times)
      return n
    }
  }
}
