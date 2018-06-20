package algorithmic.toolbox.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class NumberOfInversionsKtTest {

  @Test
  fun numberOfInversions() {
    assertEquals(2, numberOfInversions(mutableListOf(2,3,9,2,9)))
  }
}