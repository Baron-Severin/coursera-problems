package leetcode


fun convert(s: String, rows: Int): String {
  return ""
}

fun shouldPrint(x: Int, y: Int, rows: Int): Boolean {
  if (x % (rows - 1) == 0) return true
  if (rows - 1 - y == (x % (rows - 1))) return true
  return false
}