package leetcode.day2

fun longestCommonPrefix(strs: Array<String>): String {
  var strs = strs
  var common = ""
  var current = ""
  while (true) {
    if (strs.isEmpty()) return common
    for (s in strs) {
      if (current.isEmpty() && s.isNotEmpty()) current = s[0].toString()
      if (s.isEmpty() || s[0].toString() != current) return common
    }
    strs = strs.map { it.substring(1) }.toTypedArray()
    common += current
    current = ""
  }
}
