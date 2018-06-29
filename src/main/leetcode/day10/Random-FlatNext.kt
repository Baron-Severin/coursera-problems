package leetcode.day10

import kotlin.reflect.KProperty

// Not type safe
fun Collection<*>.next(): Any? {
  var next = first()
  while (next is Collection<*>) {
    next = next.first()
  }
  return next
}

//Type safe
class Nexter<T>(private val collection: Collection<*>) {

  operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
    var next = collection.first()
    while (next is Collection<*>) {
      next = next.first()
    }
    return try {
      @Suppress("UNCHECKED_CAST")
      next as T
    } catch (e: ClassCastException) {
      null
    }

  }

}
