package leetcode.day10

fun main(vararg args: String) {
  buildPascal(4)
}

fun buildPascal(n: Int): String {
  if (n == 0) return ""
  var triangle = listOf(1)
  for (i in 1 until n) {
    triangle = generateTriangle(triangle)
  }
  return triangle.joinToString(separator = "")
}

private fun generateTriangle(s: List<Int>): List<Int> {
  return (listOf(1) + s.windowed(2, 1, true) { w ->
    w[0] + (w.elementAtOrNull(1) ?: 0)
  })
}
