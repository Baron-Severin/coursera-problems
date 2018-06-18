package algorithmic.toolbox.week1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MaximumPairwiseProductTest {
  @Test
  fun maxProduct() {
    var inputs : List<Long> = listOf(1, 2, 3)
    assertEquals(6, maxProduct(inputs))

    inputs = listOf(5, 17, 8, 12, 0, 2, 34, -1)
    assertEquals(578, maxProduct(inputs))

    inputs = listOf(100000, 90000)
    assertEquals(9000000000, maxProduct(inputs))
  }

}
