package leetcode.day1

/**
 * I am so, so sorry for this code.
 *
 * I was very tired.
 */
fun isMatch(s: String, p: String): Boolean {
  val chunks = p.patternToChunks()
  return recurse(listOf(s), chunks)
}

private fun recurse(strs: List<String>, chunks: List<String>): Boolean {
  val allFlagsFulfilled = chunks.isEmpty() && strs.any { it.isEmpty() }
  val extraCharsNotMatched = chunks.isEmpty()
  val extraFlags = strs.all { it.isEmpty() } && chunks.any { it.length == 1 }
  if (allFlagsFulfilled) return true
  if (extraCharsNotMatched || extraFlags) return false

  val possibilities = mutableListOf<String>()
  strs.forEach { str ->
    val strings = str.possibleRemainings(chunks.first())
    strings?.let { possibilities += it }
  }
  return recurse(possibilities, chunks.subList(1, chunks.size))
}

private fun String.patternToChunks(): List<String> {
  val list = mutableListOf<String>()
  var i = this.length - 1
  while (i >= 0) {
    if (this[i] == '*') {
      list += this[i - 1].toString() + this[i]
      i -= 2
    } else {
      list += this[i].toString()
      i--
    }
  }
  return list.reversed()
}

private fun String.possibleRemainings(pattern: String): List<String>? {
  if (this.isEmpty() && pattern.length == 1) return null
  if (this.isEmpty() && pattern.length > 1) return listOf("")
  if (pattern.length == 1 && pattern in "a".."z") {
    return if (this[0].toString() != pattern) null
      else  listOf(this.substring(1))
  } else if (pattern == ".") {
    return listOf(this.substring(1))
  } else {
    val char = pattern[0]
    val list = mutableListOf<String>(this)
    if (char != '.' && this[0] != char) return list
    for (i in 0 until this.length) {
      if (i == this.length - 1 && this.last() == char) {
        list += ""
      } else if (this[i] == char || char == '.') {
        list += this.substring(i + 1)
      } else {
        break
      }
    }
    return list
  }
}
