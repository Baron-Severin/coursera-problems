//package algorithmic.toolbox.week1

import java.util.*


fun main(vararg args : String) {
  val scanner = Scanner(System.`in`)

  val a = scanner.nextInt()
  val b = scanner.nextInt()
  println(sumOfTwo(a, b))
}



fun sumOfTwo(a: Int, b: Int): Int {
  return a + b
}
