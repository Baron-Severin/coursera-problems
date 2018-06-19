package algorithmic.toolbox.week3

import java.util.*

class TimeSpan(val from: Int, val to: Int)

fun List<TimeSpan>.covering(time: Int) : List<TimeSpan> {
  val list = mutableListOf<TimeSpan>()
  this.forEach { if (time in it.from..it.to) list += it }
  return list
}

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  val times = mutableListOf<TimeSpan>()
  for (i in 0 until n) {
    val from = scanner.nextInt()
    val to = scanner.nextInt()
    times += TimeSpan(from, to)
  }

  val answer = signatures(times)
  println(answer.size)
  println(answer.joinToString(separator = " "))
}

fun signatures(times: List<TimeSpan>): List<Int> {
  val sortedTimes = times.sortedBy { it.to }.toMutableList()
  val times = mutableListOf<Int>()
  while (sortedTimes.size > 0) {
    val timeSpan = sortedTimes.first()
    var time = 0
    var coveredSpans = listOf<TimeSpan>()
    for (i in timeSpan.from..timeSpan.to) {
      val spans = sortedTimes.covering(i)
      if (spans.size >= coveredSpans.size) {
        time = i
        coveredSpans = spans
      }
    }
    times += time
    coveredSpans.forEach { sortedTimes.remove(it) }
  }
  return times
}