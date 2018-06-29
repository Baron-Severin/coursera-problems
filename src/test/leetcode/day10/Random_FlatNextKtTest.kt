package leetcode.day10

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Random_FlatNextKtTest {

  @Test fun oneLevel() {
    val list = listOf(1)
    assertEquals(1, list.next())
  }

  @Test fun twoLevels() {
    val list = listOf(listOf(1))
    assertEquals(1, list.next())
  }

  @Test fun threeLevels() {
    val list = listOf(listOf(listOf(1)))
    assertEquals(1, list.next())
  }

  @Test fun oneLevelTypeSafe() {
    val list = listOf(1)
    val retrieved : Int? by Nexter<Int>(list)
    assertEquals(1, retrieved)
  }

  @Test fun twoLevelsTypeSafe() {
    val list = listOf(listOf(1))
    val retrieved : Int? by Nexter<Int>(list)
    assertEquals(1, retrieved)
  }

  @Test fun threeLevelsTypeSafe() {
    val list = listOf(listOf(listOf(1)))
    val retrieved : Int? by Nexter<Int>(list)
    assertEquals(1, retrieved)
  }

}