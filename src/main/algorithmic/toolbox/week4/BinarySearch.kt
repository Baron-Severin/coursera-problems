package algorithmic.toolbox.week4

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val listSize = scanner.nextInt()
  val list = mutableListOf<Int>()
  for (i in 0 until listSize) {
    list += scanner.nextInt()
  }
  val requestSize = scanner.nextInt()
  val requests = mutableListOf<Int>()
  for (i in 0 until requestSize) {
    requests += scanner.nextInt()
  }

  println(binarySearch(list, requests).joinToString(separator = " "))
}

fun binarySearch(list: List<Int>, requests: List<Int>): List<Int> {
  val memoized = mutableMapOf<Int, Int>()
  val results = mutableListOf<Int>()
  requests.forEach {
    var mem = memoized[it]
    if (mem == null) {
      mem = bs(list, it)
      memoized[it] = mem
    }
    results += mem
  }
  return results
}

private fun bs(list: List<Int>, request: Int): Int {
  var left = 0
  var right = list.size - 1
  while (true) {
    val mid = ((right - left) / 2) + left
    if (list[mid] == request) return mid
    if (right <= left) return -1
    if (list[mid] < request) left = mid + 1
    else right = mid - 1
  }
}