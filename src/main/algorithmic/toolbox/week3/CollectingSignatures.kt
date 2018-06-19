package algorithmic.toolbox.week3

import java.util.*

class TimeSpan(val from: Int, val to: Int) {
  fun covers(check: Int) = check in from..to
  fun forEach(action: (Int) -> Unit) {
    for (i in from..to) {
      action.invoke(i)
    }
  }
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
  val sortedTimes = times.sortedBy { it.from }.toMutableList()
  val appointments = mutableListOf<Int>()
  var i = 0
  while (i < sortedTimes.size) {
    val time = sortedTimes[i]
    var overlaps = listOf<TimeSpan>()
    val potentialOverlaps = mutableListOf<TimeSpan>()
    var appointment = 0
    var potentialAppointment = 0
    time.forEach { hour ->
      potentialOverlaps.clear()
      sortedTimes.forEach { timeSpan ->
        if (timeSpan.covers(hour)) {
          potentialOverlaps += timeSpan
          potentialAppointment = hour
        }
      }
      if (potentialOverlaps.size > overlaps.size) {
        overlaps = potentialOverlaps.toList()
        appointment = potentialAppointment
      }
    }
    potentialOverlaps.forEach { sortedTimes.remove(it) }
    appointments += appointment
  }


  return appointments
}