package leetcode


fun convert(s: String, rows: Int): String {
  return ""
}

fun shouldPrint(x: Int, y: Int, rows: Int): Boolean {
  if (x % (rows - 1) == 0) return true
  if (rows - 1 - y == (x % (rows - 1))) return true
  return false
}

fun getColumns(str: String, rows: Int): Int {
  var i = 0
  var len = str.length
  while (len > 0) {
    if (i % (rows - 1) == 0) len -= rows
    else len -= 1
    i++
  }
  return i
}
