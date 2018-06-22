package leetcode.day2

import kotlin.math.max


fun maxProduct(words: Array<String>): Int {
  val bits = mutableListOf<Int>()
  var longest = 0
  for (i in words.indices) {
    bits.add(0)
    for (char in words[i]) {
      bits[i] = bits[i] or (1 shl (char - 'a'))
    }
  }

  for (i in bits.indices) {
    for (j in 1 until bits.size) {
      if (i == j) continue
      if (bits[i] and bits[j] == 0) {
        longest = max(longest, words[i].length * words[j].length)
      }
    }
  }
  return longest
}


fun maxProductSlow(words: Array<String>): Int {
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
