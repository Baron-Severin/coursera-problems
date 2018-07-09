package leetcode.day18

  fun addBinary(a: String, b: String): String {
    val a = a.padStart(b.length, '0')
    val b = b.padStart(a.length, '0')
    var carry = false
    var result = ""
    for (i in a.lastIndex downTo 0) {
      var ones = 0
      if (carry) {
        carry = false
        ones++
      }
      if (a[i] == '1') ones++
      if (b[i] == '1') ones++
      when (ones) {
        0 -> result = '0' + result
        1 -> result = '1' + result
        2 -> {
          carry = true
          result = '0' + result
        }
        3 -> {
          carry = true
          result = '1' + result
        }
      }
    }
    if (carry) result = "1" + result
    return result
  }
