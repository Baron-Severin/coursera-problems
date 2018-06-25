package leetcode.day5

fun search(nums: IntArray, target: Int): Int {
  val pivot = findPivot(nums, target)
  return searchInPivoted(nums, target, pivot)
}

fun findPivot(nums: IntArray, target: Int): Int {
  var right = nums.lastIndex
  var left = 0
  var mid : Int
  var pivot = -1
  while (pivot == -1) {
    mid = ((right - left) / 2) + left
    if (mid == nums.lastIndex || nums[mid] > nums[mid + 1]) {
      pivot = if (mid == nums.lastIndex) 0 else mid + 1
    } else if (nums[mid] > nums[right]) {
//      left = mid
      left = if (mid == nums.lastIndex) 0 else mid + 1
    } else if (nums[mid] < nums[left]) {
//      right = mid
      right = if (mid == 0) nums.lastIndex else mid - 1
    }
  }
  return pivot
}

fun searchInPivoted(nums: IntArray, target: Int, pivotIndex: Int): Int {
  var low = pivotIndex
  var high = if (pivotIndex == 0) nums.lastIndex else low - 1
  while (true) {
    val midpoint = midpointBetween(low, high, pivotIndex, nums.size)
    if (nums[midpoint] == target) {
      return midpoint
    }
    if (low == high) return -1
    if (nums[midpoint] < target) {
      low = if (midpoint == nums.lastIndex) 0 else midpoint + 1
    } else if (nums[midpoint] > target) {
      high = if (midpoint == 0) nums.lastIndex else midpoint - 1
    }
  }
}

fun midpointBetween(low: Int, high: Int, pivot: Int, arrSize: Int) : Int {
  val lastIndex = arrSize - 1
  val lowSkipped = if (low >= pivot) low - pivot else low + (lastIndex - pivot)
  val highSkipped = if (high < pivot) pivot - high - 1 else pivot + (lastIndex - high)
  val checkSize = arrSize - (lowSkipped + highSkipped)

  var mid = low + (checkSize / 2)
  if (mid > lastIndex) mid -= lastIndex
  return mid
}
