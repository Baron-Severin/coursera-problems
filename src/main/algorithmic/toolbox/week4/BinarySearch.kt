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
  return requests.map { bs(list, it) }
}

private fun bs(list: List<Int>, request: Int, left: Int = 0, right: Int = list.size - 1): Int {
  val mid = ((right - left) / 2) + left
  return when {
    list[mid] == request -> mid
    right <= left -> return -1
    list[mid] < request -> bs(list = list, request = request, left = mid + 1, right = right)
    list[mid] > request -> bs(list = list, request = request, left = left, right = mid - 1)
    else -> throw RuntimeException()
  }
}