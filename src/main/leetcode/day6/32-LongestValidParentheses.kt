package leetcode.day6

// This was accepted, but should be cleaned up
fun longestValidParentheses(s: String): Int {
  var strs = s.toList().map { it.toString() }
  var changesMade = true
  while (changesMade) {
    changesMade = false
    strs = strs.dropWhile { it == ")" }
        .dropLastWhile { it == "(" }
        .fold(mutableListOf()) { acc, s ->
          var acc = acc
          if (acc.size >= 1 && s == ")" && acc.last() == "(") {
            changesMade = true
            acc = acc.dropLast(1).toMutableList()
            acc.add("()")
          } else if (acc.size >= 2 && s == ")" && acc.last().length > 1 && acc[acc.lastIndex - 1] == "(") {
            changesMade = true
            val mid = acc.last()
            acc = acc.dropLast(2).toMutableList()
            acc.add("($mid)")
          } else if (acc.size >= 1 && s.length > 1 && acc.last().length > 1) {
            changesMade = true
            val temp = acc.last()
            acc = acc.dropLast(1).toMutableList()
            acc.add(temp + s)
          } else {
            acc.add(s)
          }
          acc
        }
  }

  if (strs.isEmpty()) return 0
  return strs.reduce { acc, s -> if (s.length > acc.length) s else acc }.length
}


/**
 * Note to self.
 *
 * The below is by another LC user.  Super clean.  Learn from this guy
 */
private class Solution {
  fun longestValidParentheses(s: String): Int {
    val stack = mutableListOf(-1)
    var max = 0
    s.forEachIndexed { j, ch ->
      if (ch == '(') {
        stack.push(j)
      } else {
        stack.pop()
        if (stack.isEmpty()) {
          stack.push(j)
        } else {
          max = Math.max(max, j - stack.peek())
        }
      }
    }
    return max
  }

  private fun <T> MutableList<T>.push(item: T) = this.add(item)

  private fun <T> MutableList<T>.pop(): T = this.removeAt(this.lastIndex)

  private fun <T> MutableList<T>.peek(): T = this.last()
}