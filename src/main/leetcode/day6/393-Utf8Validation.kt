package leetcode.day6

fun validUtf8(data: IntArray): Boolean {
  return validate(data.map { it.toBits() })
}

fun Int.toBits(): String {
  var int = this
  var build = ""
  while (int > 0) {
    build = (int % 2).toString() + build
    int /= 2
  }
  return build.padStart(8, '0')
}

fun validate(strs: List<String>): Boolean {
  var strs = strs
  while (strs.isNotEmpty()) {
    val count = strs[0].indexOf('0')
    val oneByteChar = strs[0][0] == '0'
    val firstHasFollowerCode = strs[0].substring(0, 2) == "10"
    val noZeroes = count == -1
    val moreBytesExpected = count > strs.size
    val tooManyBytes = count > 4

    when {
      oneByteChar -> strs = strs.subList(1, strs.size)
      firstHasFollowerCode -> return false
      noZeroes -> return false
      moreBytesExpected -> return false
      tooManyBytes -> return false
      else -> {
        for (i in 1 until count) {
          if (strs[i].substring(0, 2) != "10") return false
        }
        strs = strs.subList(count, strs.size)
      }
    }
  }
  return true
}
