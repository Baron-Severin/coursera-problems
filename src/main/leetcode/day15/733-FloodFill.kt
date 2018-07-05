package leetcode.day15

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int, oldColor: Int? = null): Array<IntArray> {
  val oldColor = oldColor ?: image[sr][sc]
  if (oldColor == newColor) return image
  image[sr][sc] = newColor
  listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
      .map { offset -> sr + offset.first to sc + offset.second }
      .filter { it.first >= 0 && it.second >= 0 }
      .filter { it.first <= image.lastIndex && it.second <= image[0].lastIndex }
      .filter { image[it.first][it.second] == oldColor }
      .forEach { floodFill(image, it.first, it.second, newColor, oldColor) }
  return image
}
