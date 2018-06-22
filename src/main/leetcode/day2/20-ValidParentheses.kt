package leetcode.day2

import java.util.*

class Stack {
  val deque = ArrayDeque<Char>()

  fun push(t: Char) {
    deque.push(t)
  }

  fun pop(): Char {
    return deque.pop()
  }

  fun isEmpty(): Boolean {
    return deque.isEmpty()
  }
}

val tags = listOf('(' to ')', '[' to ']', '{' to '}')

fun isValid(s: String): Boolean {
  val stack = Stack()

  s.forEach { char ->
    if (tags.any { it.first == char }) {
      stack.push(char)
    } else {
      val pair = tags.first { it.second == char }
      if (stack.isEmpty()) return false
      if (pair.first != stack.pop()) return false
    }
  }
  return stack.isEmpty()
}