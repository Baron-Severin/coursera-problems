package leetcode.day13

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _54_SpiralMatrixKtTest {
  
  @Test fun one() {
    val input = arrayOf(
      intArrayOf( 1, 2, 3 ),
      intArrayOf( 4, 5, 6 ),
      intArrayOf( 7, 8, 9 )
    )
    val output = listOf(1,2,3,6,9,8,7,4,5)
    assertEquals(output, spiralOrder(input))
  }
  
  
}