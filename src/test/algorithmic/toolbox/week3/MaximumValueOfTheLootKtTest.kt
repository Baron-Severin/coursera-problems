package algorithmic.toolbox.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MaximumValueOfTheLootKtTest {

  @Test
  fun sample1() {
    val sack = 50
    val items = listOf(Item(60, 20), Item(100, 50), Item(120, 30))
    assertEquals("180.0000", maxValueSack(sack, items))
  }

  @Test
  fun sample2() {
    val sack = 10
    val items = listOf(Item(500, 30))
    assertEquals("166.6667", maxValueSack(sack, items))
  }

  @Test
  fun round() {
    assertEquals("180.0000", round(180.toDouble()))
    assertEquals("180.0000", round(180.0))
    assertEquals("180.1010", round(180.101))
    assertEquals("180.1010", round(180.10100000001))
  }
}