package algorithmic.toolbox.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LeastCommonMultipleKtTest {

  @Test
  fun leastCommonMultiple() {
    assertEquals(24, leastCommonMultiple(6, 8))
    assertEquals(1_933_053_046, leastCommonMultiple(28_851_538, 1_183_019))
    assertEquals(2_000_000_000, leastCommonMultiple(1, 2_000_000_000))
    assertEquals(3_999_999_998_000_000_000, leastCommonMultiple(2_000_000_000, 1_999_999_999))
  }
}