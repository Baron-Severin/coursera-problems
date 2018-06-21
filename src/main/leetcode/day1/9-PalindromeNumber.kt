package leetcode.day1

fun isPalindrome(x: Int): Boolean {
  val str = x.toString()
  return str.reversed() == str
}