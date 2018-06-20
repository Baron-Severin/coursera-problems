package random.algorithms

fun <T: Comparable<T>> quickSort(items: List<T>): List<T> {
  if (items.size <= 1) return items
  val pivot = items[items.size / 2]
  val left = items.filter { it < pivot }
  val right = items.filter { it > pivot }
  val equal = items.filter { it == pivot }
  return quickSort(left) + equal + quickSort(right)
}