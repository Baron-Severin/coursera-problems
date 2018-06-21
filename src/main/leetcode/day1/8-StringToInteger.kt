package leetcode.day1

fun myAtoi(str: String): Int {
  val allowedBody = '0'..'9'
  val allowedPrefix = listOf('-', '+', '.')

  val firstGood = str.getFirstGood()
  if (firstGood == -1) return 0
  if (str.invalidStart(firstGood)) return 0
  var numStr = str.substring(firstGood)
      .takeWhile { it in allowedBody }
      .filterValidNums()
  if (firstGood != 0 && str[firstGood - 1] in allowedPrefix) numStr = str[firstGood - 1] + numStr
  numStr = numStr.trimTrailingNonDigit()

  return try {
    numStr.toDouble().toInt()
  } catch (e: Exception) {
    return 0
  }
}

private fun String.trimTrailingNonDigit(): String {
  var index = 0
  for (i in 0 until this.length) {
    if (this[i] in '0'..'9') index = i
  }
  return if (this.length <= 1) {
    this
  } else {
    this.substring(0, index + 1)
  }
}

private fun String.getFirstGood(): Int {
  var firstIndex = -1
  for (i in 0 until this.length) {
    if (this[i] in '0'..'9') {
      firstIndex = i
      break
    }
  }
  return firstIndex
}

private fun String.invalidStart(firstGood: Int): Boolean {
  val badPrefix = firstGood > 0 && this[firstGood - 1] !in listOf('-', '+', '0', ' ')
  val badStart = firstGood > 0 && this.substring(0, firstGood - 1).any { it != ' ' }
  return (badPrefix || badStart)
}

private fun String.filterValidNums(): String {
  var build = ""
  var hitNum = false
  this.forEach {
    if (it in '1'..'9') hitNum = true
    if (hitNum) build += it
  }
  return build
}
