package leetcode.day2

import kotlin.math.max

fun maxProduct(words: Array<String>): Int {
  val sortedWords = words.sortedBy { it.length }
  var biggest = 0
  sortedWords.indices
  for (i in sortedWords.size - 1 downTo 0) {
    for (j in sortedWords.size - 2 downTo 0) {
      if (i == j) continue
      val first = sortedWords[i]
      val second = sortedWords[j]
      if (first.any { second.contains(it) }) continue
      biggest = max(biggest, first.length * second.length)
    }
  }
  return biggest
}
