package random.algorithms

import java.util.*


val pattern = "%.2f"

fun computeAverages(numbers: List<Double>): Pair<Double, Double> {
  val mean = numbers.average()
  val sorted = numbers.sorted()
  val median =  when {
    sorted.size % 2 == 1 -> sorted[sorted.size / 2]
    else -> (sorted[sorted.size / 2] + sorted[sorted.size / 2 - 1]) / 2
  }
  return mean.cleaned() to median.cleaned()
}

fun Double.cleaned(): Double {
  return pattern.format(this).toDouble()
}




val open = listOf('(', '[', '{')
val close = listOf(')', ']', '}')

class Parser(val input: String) {

  fun test(): Boolean {
    val encountered = ArrayDeque<Char>()
    input.forEach { c ->
      if (c in open) encountered.push(c)
      else {
        if (encountered.isEmpty()) return false
        val last = encountered.pop()
        if (last !in open || open.indexOf(last) != close.indexOf(c)) return false
      }
    }
    return encountered.isEmpty()
  }

}
