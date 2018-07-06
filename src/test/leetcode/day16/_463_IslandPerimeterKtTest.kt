package leetcode.day16

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _463_IslandPerimeterKtTest {
  
  @Test fun one() {
    val input = 
     arrayOf(intArrayOf(0,1,0,0),
      intArrayOf(1,1,1,0),
      intArrayOf(0,1,0,0),
      intArrayOf(1,1,0,0))
    val output = 16
    assertEquals(output, islandPerimeter(input))
  }

  @Test fun two() {
    val input =
        arrayOf(intArrayOf(0,1,0,0),
        intArrayOf(1,1,1,0),
        intArrayOf(0,1,0,0),
        intArrayOf(1,1,0,0))
    val allCoords = 16
    val allLandCoords = 7
    assertEquals(allCoords, allCoords(input).size)
    assertEquals(allLandCoords, allLandCoords(input).size)
  }
  
  
}