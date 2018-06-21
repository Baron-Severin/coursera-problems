package leetcode.day2

private val combos = mapOf(
    "IV" to 4,
    "IX" to 9,
    "XL" to 40,
    "XC" to 90,
    "CD" to 400,
    "CM" to 900
)
private val digits = mapOf(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000
)

fun romanToInt(s: String): Int {

  val postCombo = combos.entries.tally(s, 0)
  val postDigits = digits.entries.tally(postCombo.first, postCombo.second)

  return postDigits.second
}

private fun Set<Map.Entry<String, Int>>.tally(str: String, total: Int): Pair<String, Int> {
  var str = str
  var total = total
  this.forEach { entry ->
    var index = str.indexOf(entry.key)
    while (index != -1) {
      total += entry.value
      str = str.replaceRange(index, index + entry.key.length, "")
      index = str.indexOf(entry.key)
    }
  }
  return Pair(str, total)
}