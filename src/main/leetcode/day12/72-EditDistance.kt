package leetcode.day12

  fun minDistance(word1: String, word2: String): Int {
    val dp = Array(word1.length + 1) { Array(word2.length + 1) { 0 } }

    for (i in 1..dp.lastIndex) {
      dp[i][0] = i
    }
    for (i in 1..dp[0].lastIndex) {
      dp[0][i] = i
    }

    for (i in 1..dp.lastIndex) {
      for (j in 1..dp[0].lastIndex) {
        dp[i][j] = if (word1[i - 1] == word2[j - 1]) {
          dp[i - 1][j - 1]
        } else {
          (listOf(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]).min()!!) + 1
        }
      }
    }
    return dp[word1.length][word2.length]
  }

