package random.algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MozillaHackerRankScratchKtTest {

  @Test fun one() {
    val input = listOf(4.0,1.0,2.0,3.0,4.0,5.0)
    val expect = 3.17 to 3.5
    assertEquals(expect, computeAverages(input))
  }

  @Test fun two() {
    val input = listOf(4.0,1.0,2.0,3.0,5.0)
    val expect = 3.0 to 3.0
    assertEquals(expect, computeAverages(input))
  }
  
  @Test fun three() {
    val input = listOf(39.0, 25.0, 96.0, 8.0, 20.0, 23.0, 85.0, 51.0, 48.0, 33.0, 35.0)
    val expect = 42.09 to 35.0
    assertEquals(expect, computeAverages(input))
  }
  
  @Test fun gen() {
    val t = (0..20).map { 100 * Math.random() }
    
    println()
    
  }





}