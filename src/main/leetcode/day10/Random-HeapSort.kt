package leetcode.day10

fun <T : Comparable<T>> heapSort(arr: Array<T>) {
  val heap = MinHeap<T>()
  heap.addAll(arr)
  for (i in 0 until arr.size) {
    heap.poll()?.let { arr[i] = it }
  }
}

class MinHeap<T : Comparable<T>> {
  var arr = Array<Any?>(10) { null }
  var size = 0
  private val lastIndex
    get() = size - 1

  fun add(t: T) {
    size++
    ensureCapacity()
    arr[lastIndex] = t
    heapifyUp(lastIndex)
  }

  fun addAll(col: Collection<T>) {
    col.forEach { add(it) }
  }

  fun addAll(arr: Array<T>) {
    arr.forEach { add(it) }
  }

  fun poll(): T? {
    if (size == 0) return null
    val removed = arr.first()
    arr[0] = arr[lastIndex]
    arr[lastIndex] = null
    size--
    heapifyDown(0)
    return removed?.let { it as T }
  }

  fun peek(): T? {
    return arr.first() ?.let { it as T }
  }

  private fun ensureCapacity() {
    if (size == arr.size) {
      arr = arr.copyOf(arr.size * 2)
    } else if (size > 10 && size < arr.size * .25) {
      arr = arr.copyOf((arr.size * .5).toInt())
    }
  }

  private fun swapIndexes(i1: Int, i2: Int) {
    val temp = arr[i1]
    arr[i1] = arr[i2]
    arr[i2] = temp
  }

  private fun heapifyDown(index: Int) {
    val (left, right) = getChildren(index)
    if (left <= lastIndex && (arr[left] as T) < (arr[index] as T)) {
      swapIndexes(index, left)
      heapifyDown(left)
    }
    if (right <= lastIndex && (arr[right] as T) < (arr[index] as T)) {
      swapIndexes(index, right)
      heapifyDown(right)
    }
  }

  private fun heapifyUp(index: Int) {
    val parent = getParent(index) ?: return
    if ((arr[parent] as T) > (arr[index] as T)) {
      swapIndexes(parent, index)
      heapifyUp(parent)
    }
  }

  private fun getParent(index: Int): Int? {
    val parent = (if (index % 2 == 0) index - 2 else index - 1) / 2
    return if (parent >= 0) parent else null
  }

  private fun getChildren(index: Int): Pair<Int, Int> {
    val left = index * 2 + 1
    val right = index * 2 + 2
    return left to right
  }


}