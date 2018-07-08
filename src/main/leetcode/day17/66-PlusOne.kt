package leetcode.day17

fun plusOne(digits: IntArray): IntArray {
  var done = false
  for (i in digits.lastIndex downTo 0) {
    if (digits[i] < 9) {
      digits[i]++
      done = true
      break
    } else {
      digits[i] = 0
    }
  }
  if (done) return digits
  val result = IntArray(digits.size + 1)
  result[0] = 1
  digits.forEachIndexed { i, v -> result[i + 1] = v }
  return result
}