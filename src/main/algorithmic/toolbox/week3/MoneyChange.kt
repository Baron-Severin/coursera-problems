package algorithmic.toolbox.week3

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val total = scanner.nextInt()

  println(moneyChange(total))
}

fun moneyChange(total: Int): Int {
  var total = total
  var operations = 0
  while (total > 0) {
    when {
      total >= 10 -> total -= 10
      total >= 5 -> total -= 5
      else -> total--
    }
    operations++
  }
  return operations
}