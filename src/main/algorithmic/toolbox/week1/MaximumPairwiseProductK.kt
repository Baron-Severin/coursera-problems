package algorithmic.toolbox.week1

import java.util.*

fun main(vararg args : String) {
  val scanner = Scanner(System.`in`)
  var n = scanner.nextInt()

  val inputs = ArrayList<Long>()

  while (n > 0) {
    inputs.add(scanner.nextLong())
    n--
  }
  println(maxProduct(inputs))
}

fun maxProduct(inputs: List<Long>): Long {
  inputs.fold(Pair(Long.MIN_VALUE, Long.MIN_VALUE)) { acc, i ->
    val bigger = Math.max(acc.first, acc.second)
    val smaller = Math.min(acc.first, acc.second)
    when {
      smaller < i -> i to bigger
      else -> acc
    }
  }.let { pair ->
    return pair.first * pair.second
  }

}
