package algorithmic.toolbox.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class BinarySearchKtTest {

  @Test
  fun binarySearch() {
    val list = listOf(1, 5, 8, 12, 13)
    val requests = listOf(8, 1, 23, 1, 11)
    val output = listOf(2, 0, -1, 0, -1)
    assertEquals(output, binarySearch(list, requests))
  }
}