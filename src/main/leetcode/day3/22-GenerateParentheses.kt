package leetcode.day3

fun generateParenthesis(n: Int): List<String> {
  val opens = "(".times(n)
  val closes = ")".times(n)

  return recurse(opens, closes)
}

fun recurse(opens: List<String>,
            closes: List<String>,
            base: String = ""): List<String> {
  if (opens.isEmpty() && closes.isEmpty()) {
    return listOf(base)
  }
  if (opens.isEmpty()) {
    val new = base + closes.joinToString(separator = "")
    return listOf(new)
  }

  val plusOpen = lazy { recurse(opens.drop(1), closes, "$base(") }
  val plusClose = lazy { recurse(opens, closes.drop(1), "$base)") }

  return if (opens.size < closes.size) {
    plusOpen.value + plusClose.value
  } else {
    plusOpen.value
  }
}

private fun String.times(n: Int): List<String> {
  return this.flatMap { it.toString().repeat(n).split("").drop(1).dropLast(1) }
}