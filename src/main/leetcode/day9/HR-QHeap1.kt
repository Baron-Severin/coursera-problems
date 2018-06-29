package leetcode.day9

import java.util.*


fun main(args: Array<String>) {
  val add = 1
  val delete = 2
  val print = 3

  val scanner = Scanner(System.`in`)
  val q = scanner.nextInt()

  val heap = MinHeap()

  for (i in 0..q) {
    val op = scanner.nextInt()
    val value = if (op == add || op == delete) {
      scanner.nextInt()
    } else {
      -1
    }
    when (op) {
      add -> heap.add(value)
      delete -> heap.delete(value)
      print -> println(heap.peek())
    }
  }

}

class MinHeap {
  var arr = Array<Int?>(10) { null }
  var size = 0
  val last
    get() = arr[lastIndex]
  val lastIndex
    get() = size - 1
  val isEmpty
    get() = size == 0

  override fun toString() = arr.joinToString()

  fun add(int: Int) {
    size++
    checkCapacity()
    arr[lastIndex] = int
    heapifyUp(lastIndex)
  }

  fun peek(): Int? {
    return arr[0]
  }

  fun poll(): Int? {
    val value = peek()
    if (value == null) return value
    swap(lastIndex, 0)
    arr[lastIndex] = null
    heapifyDown(0)
    checkCapacity()
    size--
    return value
  }

  fun delete(n: Int) {
    val index = arr.indexOf(n)
    arr[index] = null
    swap(index, lastIndex)
    heapifyDown(index)
    size--
  }

  private fun checkCapacity() {
    if (size == arr.size) {
      arr = arr.copyOf(arr.size * 2)
    } else if (arr.size > 10 && size.toDouble() < arr.size * .25) {
      arr = arr.copyOf(arr.size / 2)
    }
  }

  private fun getParentIndex(childIndex: Int): Int {
    if (childIndex == 0) throw IllegalArgumentException("Root has no parent")
    return (childIndex - 1) / 2
  }

  private fun getLeftIndex(parentIndex: Int): Int {
    return parentIndex * 2 + 1
  }

  private fun getRightIndex(parentIndex: Int): Int {
    return parentIndex * 2 + 2
  }

  private fun heapifyUp(i: Int) {
    if (i == 0) return
    var i = i
    var parent = getParentIndex(i)
    while (arr[parent] ?: Int.MIN_VALUE > arr[i] ?: Int.MAX_VALUE) {
      swap(parent, i)
      i = parent
      if (i == 0) return
      parent = getParentIndex(i)
    }
  }

  private fun heapifyDown(i: Int) {
    val left = getLeftIndex(i)
    val right = getRightIndex(i)
    while (left <= lastIndex && arr[left] ?: Int.MAX_VALUE < arr[i] ?: Int.MIN_VALUE) {
      swap(left, i)
      heapifyDown(left)
    }
    while (right <= lastIndex && arr[right] ?: Int.MAX_VALUE < arr[i] ?: Int.MIN_VALUE) {
      swap(right, i)
      heapifyDown(right)
    }
  }

  private fun swap(i1: Int, i2: Int) {
    val temp = arr[i1]
    arr[i1] = arr[i2]
    arr[i2] = temp
  }

}
