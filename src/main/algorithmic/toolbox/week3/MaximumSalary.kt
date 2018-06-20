package algorithmic.toolbox.week3

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  val nums = mutableListOf<Int>()
  for (i in 0 until n) {
    nums += scanner.nextInt()
  }
  println(maxSalary(nums))
}

fun maxSalary(nums: List<Int>): String {
  return nums
      .sortedWith(Comparator { o1, o2 ->
        val first = o1.toString()
        val second = o2.toString()
        for (i in 0..Math.max(first.length, second.length)) {
          if (first.length - 1 < i) return@Comparator -1
          if (second.length -1 < i) return@Comparator 1
          if (first.first() != second.first()) return@Comparator second.first().toInt() - first.first().toInt()
        }
        0
      })
      .joinToString(separator = "")
}