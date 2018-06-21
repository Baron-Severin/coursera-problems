package leetcode.day1

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
  val all = merge(nums1, nums2)
  val mid = all.size / 2
  if (all.size % 2 == 1) return all[mid].toDouble()
  return (all[mid].toDouble() + all[mid - 1].toDouble()) / 2
}

fun merge(arr1: IntArray, arr2: IntArray): IntArray {
  val result = IntArray(arr1.size + arr2.size)

  var index1 = 0
  var index2 = 0
  var indexR = 0
  while (index1 < arr1.size && index2 < arr2.size) {
    when {
      arr2[index2] <= arr1[index1] -> {
        result[indexR] = arr2[index2]
        index2++
        indexR++
      }
      arr1[index1] <= arr2[index2] -> {
        result[indexR] = arr1[index1]
        index1++
        indexR++
      }
    }
  }
  while (index1 < arr1.size) {
    result[indexR] = arr1[index1]
    index1++
    indexR++
  }
  while (index2 < arr2.size) {
    result[indexR] = arr2[index2]
    index2++
    indexR++
  }
  return result
}
