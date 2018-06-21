package leetcode


private lateinit var str: String
private var maxPal = ""

fun longestPalindrome(s: String): String {
  str = s
  for (i in 0 until s.length - 1) {
    maxGrow(i, i)
    maxGrow(i, i + 1)
  }
  return maxPal
}

private fun maxGrow(left: Int, right: Int) {
  var left = left
  var right = right
  while (left >= 0 && right <= str.length) {
    if (str[left] != str[right]) return
    if ((right - left + 1) > maxPal.length) {
      maxPal = str.substring(left, right + 1)
    }
    left--
    right++
  }
}