package leetcode.day15

fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {

  val sorted = people.sortedWith(compareBy({ it[0] }, { -it[1] }))
  val openSpaces = (people.indices).toMutableList()
  val result = MutableList(people.size) { intArrayOf() }

  sorted.forEach { person ->
    val to = openSpaces[person[1]]
    openSpaces.remove(to)
    result[to] = person
  }

  return result.toTypedArray()
}

