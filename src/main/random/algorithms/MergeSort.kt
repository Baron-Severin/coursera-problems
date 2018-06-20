package random.algorithms

fun <T : Comparable<T>> mergeSort(items: List<T>): List<T> {
  if (items.size < 2) return items

  fun merge(left: MutableList<T>, right: MutableList<T>): List<T> {
    val merged = mutableListOf<T>()
    while (left.isNotEmpty() && right.isNotEmpty()) {
      merged += if (left.first() <= right.first()) {
        left.removeAt(0)
      } else {
        right.removeAt(0)
      }
    }
    merged.addAll(left)
    merged.addAll(right)
    return merged
  }

  val pivot = items.size / 2
  return merge(mergeSort(items.subList(0, pivot)).toMutableList(), mergeSort(items.subList(pivot, items.size)).toMutableList())
}