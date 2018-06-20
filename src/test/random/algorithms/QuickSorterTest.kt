package random.algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class QuickSorterTest {

  @Test
  fun quickSort() {
    val strings = listOf("g", "q", "a", "f", "b", "c", "d")
    assertEquals(listOf("a", "b", "c", "d", "f", "g", "q"), quickSort(strings))

    val ints = listOf(10, 4, 5, 1, 2, 3, 8, 9, 7, 6)
    assertEquals(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), quickSort(ints))

  }
}