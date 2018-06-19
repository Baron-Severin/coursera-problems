package algorithmic.toolbox.week3

import java.util.*

data class Item(val value: Int, val weight: Int)
data class WeightedItem(val efficiency: Double, val item: Item)

fun main(vararg args: String) {
  val scanner = Scanner(System.`in`)
  val itemCount = scanner.nextInt()
  val sack = scanner.nextInt()
  val items = mutableListOf<Item>()
  for (i in 0 until itemCount) {
    val value = scanner.nextInt()
    val weight = scanner.nextInt()
    items.add(Item(value, weight))
  }

  println(maxValueSack(sack, items))
}

fun maxValueSack(sack: Int, items: List<Item>): String {
  val weighted = mutableListOf<WeightedItem>()
  items.forEach {
    val efficiency : Double = it.value.toDouble() / it.weight.toDouble()
    weighted += WeightedItem(efficiency, it)
  }
  weighted.sortBy { it.efficiency }

  var addedValue = 0.0
  var sack = sack
  while (sack > 0 && weighted.size > 0) {
    val best = weighted.last()

    if (best.item.weight <= sack) {
      sack -= best.item.weight
      addedValue += best.item.value
    } else {
      addedValue += best.efficiency * sack
      sack = 0
    }
    weighted -= best
  }


  return round(addedValue)
}

fun round(total: Double): String {
  return "%.4f".format(total)
}