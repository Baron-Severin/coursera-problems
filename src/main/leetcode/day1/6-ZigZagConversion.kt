package leetcode.day1


fun convert(s: String, rows: Int): String {
  val colCount = getColumns(s, rows)
  var strIndex = 0
  val built = mutableListOf<String>()
  for (y in 0 until rows) built += ""
  for (x in 0 until colCount) {
    for (y in 0 until rows) {
      if (strIndex < s.length && shouldPrint(x, y, rows)) {
        built[y] = built[y] + s[strIndex]
        strIndex++
      }
    }
  }
  return built.joinToString(separator = "")
}

fun shouldPrint(x: Int, y: Int, rows: Int): Boolean {
  if (rows == 1) return true
  if (x % (rows - 1) == 0) return true
  if (rows - 1 - y == (x % (rows - 1))) return true
  return false
}

fun getColumns(str: String, rows: Int): Int {
  if (rows == 1) return str.length
  var i = 0
  var len = str.length
  while (len > 0) {
    if (i % (rows - 1) == 0) len -= rows
    else len -= 1
    i++
  }
  return i
}
