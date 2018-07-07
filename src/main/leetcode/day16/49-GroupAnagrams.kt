package leetcode.day16

fun groupAnagrams(strs: Array<String>): List<List<String>> {
  return strs.groupBy { it.countingSort() }.map { it.value }
}

fun String.countingSort(): List<Int> {
  val arr = IntArray(27)
  this.map { it - 'a' }.forEach { arr[it] = arr[it] + 1 }
  return arr.toList()
}


// O(S log S) time where S is the length of the words (but very high constant time), O(n) space
//fun groupAnagrams(strs: Array<String>): List<List<String>> {
//  val result = mutableListOf<List<String>>()
//  val pairs = strs.map { s -> s.map { char -> char - 'a' }.sorted() to s }
//  pairs.map { it.first }.toSet().forEach { code ->
//    result += pairs.filter { it.first == code }.map { it.second }
//  }
//  return result
//}
