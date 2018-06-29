package leetcode.day10

fun main(vararg args: String) {
  printPascal(4)
}

fun printPascal(rows:Int) {
  var row = "1"
  println(row)
  for (i in 1..rows) {
    row = "1${row.createBody()}1"
    println(row)
  }
}

private fun String.createBody(): String {
  return this.foldIndexed("") { i, acc, char ->
    var acc = acc
    if (i < this.lastIndex) {
      acc += (char - '0') + (this[i + 1] - '0')
    }
    acc
  }
}
