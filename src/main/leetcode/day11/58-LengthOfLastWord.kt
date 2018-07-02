package leetcode.day11

fun lengthOfLastWord(s: String): Int {
  if (s.indexOf(' ') == -1) return 0
  return s.split(' ').last().length
}

fun lengthOfLastWordSlow(s: String): Int {
  if (s.indexOf(' ') == -1) return 0
  return s.split(' ').last().length
}
