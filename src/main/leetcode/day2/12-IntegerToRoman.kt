package leetcode.day2

private val table = listOf(
    "IV" to 4,
    "IX" to 9,
    "XL" to 40,
    "XC" to 90,
    "CD" to 400,
    "CM" to 900,
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000
).sortedByDescending { it.second }

fun intToRoman(num: Int): String {
  var num = num
  val list = mutableListOf<String>()
  while (num > 0) {
    val removing = table.first { it.second <= num }
    list += removing.first
    num -= removing.second
  }
  return list.joinToString(separator = "")
}