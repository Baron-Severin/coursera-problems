package leetcode.day3

fun findSubstring(s: String, words: Array<String>): List<Int> {
  if (s.isEmpty() || words.isEmpty()) return emptyList()
  val wordKeys = words.map { it.hashCode() }.countOccurances()
  val wordLen = words[0].length
  val concatenatedLen = words.joinToString(separator = "").length

  val indices = mutableListOf<Int>()
  for (i in 0..s.lastIndex - (concatenatedLen - 1)) {

    val substring = if (i + concatenatedLen - 1 == s.length) {
      s.takeLast(concatenatedLen)
    } else {
      (s.substring(i, i + concatenatedLen))
    }
    val chunked = substring.chunked(wordLen)
    val coded = chunked.map { it.hashCode() }
    val counted = coded.countOccurances()

    val sameElements = counted.all {  entry ->
      entry.value == wordKeys[entry.key]
    }
    if (sameElements) indices += i
  }
  return indices
}

fun String.toKey(): Int {
  return this.map { (it - 'a') }
      .reduce { acc, c -> (acc shl 1) + c }
}

fun Collection<Int>.countOccurances(): Map<Int, Int> {
  return this.fold(mutableMapOf()) { acc, i ->
    val value = (acc[i] ?: 0) + 1
    acc[i] = value
    acc
  }
}







/**
 * Time limit exceeded on giant input with a lot of permutations
 */
fun findSubstringSlow(s: String, words: Array<String>): List<Int> {
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
