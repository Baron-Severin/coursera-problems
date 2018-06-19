package random.algorithms

fun boxBlur(input: Array<Array<Int>>): Array<Array<Int>> {
  val output = Array(input.size) { Array(input[0].size) { 0 } }
  for (r in 0 until input.size) {
    for (c in 0 until input[0].size) {
      val surroundings = getSurroundingValues(input, r to c)
      output[r][c] = surroundings.sum() / surroundings.size
    }
  }
  return trimEdges(output)
}

fun getSurroundingValues(input: Array<Array<Int>>, coords: Pair<Int, Int>): Array<Int> {
  val rows = arrayOf(coords.first - 1, coords.first, coords.first + 1)
  val cols = arrayOf(coords.second - 1, coords.second, coords.second + 1)

  return rows.flatMap { r -> cols.map { c -> r to c } }
              .filter { isInBounds(input, it) }
              .map { coordinate -> input[coordinate.first][coordinate.second] }
              .toTypedArray()
}

fun isInBounds(input: Array<Array<Int>>, coords: Pair<Int, Int>): Boolean {
  return when {
    coords.first < 0 -> false
    coords.second < 0 -> false
    coords.first >= input.size -> false
    coords.second >= input[0].size -> false
    else -> true
  }
}

fun trimEdges(input: Array<Array<Int>>): Array<Array<Int>> {
  return input.map { it.sliceArray(IntRange(1, it.size - 2)) }
      .toTypedArray()
      .sliceArray(IntRange(1, input.size - 2))
}
