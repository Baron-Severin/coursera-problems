package leetcode

import java.lang.Math.abs

fun reverse(x: Int): Int {
  var str = x.toString()
  var neg = false
  if (str[0] == '-') {
    str = str.substring(1)
    neg = true
  }
  str = str.reversed()
  if (neg) str = "-$str"

  return try {
    str.toInt()
  } catch (e: Exception) {
    0
  }
}

fun reverseFast(x: Int): Int {
  val neg = x < 0
  var x : Long = abs(x.toLong())
  val list = mutableListOf<Long>()

  while (x >= 10) {
    list += x % 10
    x /= 10
  }
  list += x
  var reversed : Long = 0
  while (list.isNotEmpty()) {
    reversed *= 10
    reversed += list.removeAt(0)
  }
  if (reversed > Integer.MAX_VALUE) return 0
  if (neg) reversed = -reversed

  return reversed.toInt()
}
