package leetcode.day18

import kotlin.math.max
import kotlin.math.min

data class Interval(
    var start: Int = 0,
    var end: Int = 0
)

fun merge(intervals: List<Interval>): List<Interval> {
  if (intervals.size < 2) return intervals
  var result = intervals.sortedBy { it.start }
  var changesMade = true
  while (changesMade && result.size >= 2) {
    val build = mutableListOf<Interval>()
    changesMade = false
    var i = 1
    while (i <= result.size) {
      if (i <= result.lastIndex && result[i].start in result[i - 1].start..result[i - 1].end) {
        changesMade = true
        val start = min(result[i].start, result[i - 1].start)
        val end = max(result[i].end, result[i - 1].end)
        build += Interval(start, end)
        i++
      } else {
        build += result[i - 1]
      }
      i++
    }
    result = build
  }
  return result
}