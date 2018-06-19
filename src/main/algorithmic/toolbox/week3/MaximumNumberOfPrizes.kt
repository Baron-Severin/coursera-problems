package algorithmic.toolbox.week3

import java.util.*

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()

  val prizes = maxPrizes(n)
  println(prizes.size)
  println(prizes.joinToString(separator = " "))
}

fun maxPrizes(n: Int) : List<Int> {
  var n = n - 1
  val prizes = mutableListOf(1)
  while (n > 0) {
    if (prizes.last() + 1 > n) {
      prizes[prizes.lastIndex] = prizes.last() + n
    } else {
      val next = prizes.last() + 1
      prizes += next
      n -= next
    }
  }
  return prizes
}
