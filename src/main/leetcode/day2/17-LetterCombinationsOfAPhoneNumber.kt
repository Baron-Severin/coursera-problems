val map = mapOf(
    '2' to "abc",
    '3' to "def",
    '4' to "ghi",
    '5' to "jkl",
    '6' to "mno",
    '7' to "pqrs",
    '8' to "tuv",
    '9' to "wxyz"
)

fun letterCombinations(digits: String): List<String> {
  return assemble(digits.map { it.toLetters() })
}

fun Char.toLetters(): List<Char> {
  return map[this]?.split("")!!.filter{ it != "" }.map { it[0] }
}

fun assemble(letters: List<List<Char>>, assembled: MutableList<String> = mutableListOf("")): List<String> {
  if (letters.isEmpty()) return assembled
  return assemble(letters.subList(1, letters.size),
      assembled.flatMap { str ->  letters[0].map { char -> str + char } }.toMutableList())
}
