package leetcode

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