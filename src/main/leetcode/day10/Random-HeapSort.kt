package leetcode.day10

class MinHeap<T: Comparable<T>> {
  var arr = Array<Any?>(10) { null }
  var size = 0
  val lastIndex
    get() = size - 1
  val last
    get() = arr[lastIndex]

  fun add(t: T) {
    size++
    ensureCapacity()
    arr[lastIndex] = t
    heapifyUp(lastIndex)
  }

  fun poll(): T? {
    val removed = arr.first()
    arr[0] = arr[lastIndex]
    arr[lastIndex] = null
    size--
    return removed as T
  }

  fun peek(): T? {
    //TODO
    return null
  }

  private fun ensureCapacity() {
    //TODO
  }

  private fun swapIndexes(i1: Int, i2: Int) {
    //TODO
  }

  private fun heapifyDown(index: Int) {
    //TODO
  }

  private fun heapifyUp(index: Int) {
    //TODO
  }

  private fun getParent(index: Int): Int {
    //TODO
    return -1
  }

  private fun getChildren(index: Int): Pair<Int, Int> {
    //TODO
    return Pair(-1, -1)
  }


}