package leetcode.day16

  fun islandPerimeter(grid: Array<IntArray>): Int {
    if (grid.isEmpty() || grid.first().isEmpty()) return 0
    return allLandCoords(grid)
        .map { getLandNeighborCount(it.first, it.second, grid) }
        .map { 4 - it }
        .sum()
  }

fun allLandCoords(grid: Array<IntArray>): List<Pair<Int, Int>> {
  return allCoords(grid)
      .filter { grid[it.first][it.second] == 1 }
}

fun allCoords(grid: Array<IntArray>): List<Pair<Int, Int>> {
  return (0..grid.lastIndex).toList()
      .flatMap { r -> (0..grid.first().lastIndex).map { c -> r to c } }
}

fun getLandNeighborCount(r: Int, c: Int, grid: Array<IntArray>): Int {
  return getNeighbors(r, c, grid).filter { it == 1 }
      .count()
}

fun getNeighbors(r: Int, c: Int, grid: Array<IntArray>): List<Int> {
  return getNeighborCoords(r, c, grid)
      .map { grid[it.first][it.second] }
}

fun getNeighborCoords(r: Int, c: Int, grid: Array<IntArray>): List<Pair<Int, Int>> {
  return listOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)
      .map { r + it.first to c + it.second }
      .filter { it.first >= 0 && it.second >= 0 }
      .filter { it.first <= grid.lastIndex && it.second <= grid.first().lastIndex }
}
