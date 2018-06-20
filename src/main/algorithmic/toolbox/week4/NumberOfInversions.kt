package algorithmic.toolbox.week4

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  val list = mutableListOf<Int>()
  for (i in 0 until n) {
    list += scanner.nextInt()
  }

  println(numberOfInversions(list))
}

fun numberOfInversions(list: MutableList<Int>): Int {
  return mergeSort(list).second
}

fun <T : Comparable<T>> mergeSort(items: MutableList<T>): Pair<MutableList<T>, Int> {
  if (items.size < 2) return Pair(items, 0)

  fun merge(left: MutableList<T>, right: MutableList<T>): Pair<MutableList<T>, Int> {
    val merged = mutableListOf<T>()
    var count = 0
    while (left.isNotEmpty() && right.isNotEmpty()) {
      merged += if (left.first() <= right.first()) {
        left.removeAt(0)
      } else {
        count++
        right.removeAt(0)
      }
    }
    merged.addAll(left)
    merged.addAll(right)
    return Pair(merged, count)
  }

  val pivot = items.size / 2
  val leftRes = mergeSort(items.subList(0, pivot).toMutableList())
  val rightRes = mergeSort(items.subList(pivot, items.size).toMutableList())
  val merged = merge(leftRes.first, rightRes.first)
  return Pair(merged.first, merged.second + leftRes.second + rightRes.second)
}
