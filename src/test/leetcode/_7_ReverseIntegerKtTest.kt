package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _7_ReverseIntegerKtTest {

  @Test
  fun reverse() {
    assertEquals(321, reverse(123))
    assertEquals(-321, reverse(-123))
    assertEquals(21, reverse(120))
    assertEquals(0, reverse(1_534_236_469))
  }
}