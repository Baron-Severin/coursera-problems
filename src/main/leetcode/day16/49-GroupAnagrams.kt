package leetcode.day16

fun groupAnagrams(strs: Array<String>): List<List<String>> {
  val result = mutableListOf<List<String>>()
  val pairs = strs.map { s -> s.map { char -> char - 'a' }.sorted() to s }
  pairs.map { it.first }.toSet().forEach { code ->
    result += pairs.filter { it.first == code }.map { it.second }
  }
  return result
}