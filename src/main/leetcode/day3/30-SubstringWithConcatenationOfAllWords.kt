package leetcode.day3


/**
 * Time limit exceeded on giant input with a lot of permutations
 */
fun findSubstring(s: String, words: Array<String>): List<Int> {
  return perms(words.toList())
      .toSet()
      .flatMap { s.getIndexesOf(it) }
      .filter { it != -1 }
}

fun perms(arr: List<String>, base: String = ""): List<String> {
  if (arr.isEmpty()) return listOf(base)
  return arr.flatMap { perms(arr - it, base + it) }
}

fun String.getIndexesOf(str: String): List<Int> {
  if (str.isEmpty()) return emptyList()
  val list = mutableListOf<Int>()
  this.forEachIndexed { i, char ->
    if (str[0] == char) {
      if (str.length - 1 <= this.lastIndex - i) {
        var bool = true
        for (j in str.indices) {
          if (this[i + j] != str[j]) {
            bool = false
            break
          }
        }
        if (bool) list += i
      }
    }
  }
  return list
}
