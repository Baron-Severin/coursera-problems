package algorithmic.toolbox.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MajorityElementKtTest {

  @Test
  fun majorityElement() {
    assertEquals(1, majorityElement(listOf(2,3,9,2,2)))
    assertEquals(0, majorityElement(listOf(1,2,3,4)))
  }
}