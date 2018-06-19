package algorithmic.toolbox.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MaximumNumberOfPrizesKtTest {

  @Test
  fun maxPrizes() {
    assertEquals(listOf(1, 2, 3), maxPrizes(6))
    assertEquals(listOf(1, 2, 5), maxPrizes(8))
    assertEquals(listOf(2), maxPrizes(2))


  }



  @Test fun temp() {
    var next = 0
    var total = 0
    for (i in 0..20) {
      next++
      total += next
      println("next: $next, total: $total")
    }
  }
}