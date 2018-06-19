package algorithmic.toolbox.week3

import java.lang.Math.abs
import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  val values = SortedList<Long>(n)
  val clicks = SortedList<Long>(n)
  for (i in 0 until n) {
    values += scanner.nextLong()
  }
  for (i in 0 until n) {
    clicks += scanner.nextLong()
  }

  println(maxRevenue(values, clicks))
}

fun maxRevenue(values: SortedList<Long>, clicks: SortedList<Long>): Long {
  return values
      .zip(clicks) {value, click -> value * click}
      .reduce { acc, i -> acc + i }
}

class SortedList<T : Comparable<T>>(size: Int) : ArrayList<T>(size) {
  override fun add(element: T): Boolean {
    val bs = this.binarySearch(element)
    val fixed = if (bs < 0) abs(bs) - 1 else bs


    super.add(fixed, element)
    return true
  }
}
