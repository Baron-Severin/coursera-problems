package leetcode.day9

/**
 * This shortens the string by about half, but that's not enough for the question.  Instead, a stateful solution is
 * required.  See [N535EncodeAndDecodeTinyUrl]
 */

val values = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-._~:/?#[]@!\$&'()*+,;=%".toSet()

fun String.toCodedLong(): Long {
  val intList = this.map { values.indexOf(it) }
  var longVal = 0L
  for (i in intList) {
    longVal = longVal shl 7
    longVal += i
  }
  return longVal
}

val code = (('0'..'9') + ('a'..'z') + ('A'..'Z'))

fun Long.toCodedString(): String {
  var long = this
  var build = ""
  while (long > 0) {
    build += code[(long % code.size).toInt()]
    long /= code.size
  }
  return build
}

