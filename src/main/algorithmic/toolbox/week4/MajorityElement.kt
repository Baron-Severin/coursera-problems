package algorithmic.toolbox.week4

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  val list = mutableListOf<Int>()
  for (i in 0 until n) {
    list += scanner.nextInt()
  }

  println(majorityElement(list))
}

fun majorityElement(list: List<Int>): Int {
  val map = mutableMapOf<Int, Int>()
  list.forEach { map[it] = (map[it] ?: 0) + 1 }

  return if (map.keys.any { map[it] ?: 0 > list.size / 2 }) 1 else 0
}