package leetcode.day4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _29_DivideTwoIntegersKtTest {

  @Test fun one() {
    assertEquals(3, divide(10, 3))
  }

  @Test fun two() {
    assertEquals(1, divide(-2147483648, 1))
  }

  @Test fun three() {
    assertEquals(1, divide(1, 1))
  }

  @Test fun four() {
    assertEquals(0, divide(0, 1))
  }

  @Test fun five() {
    assertEquals(-1, divide(-1, 1))
  }

  @Test fun six() {
    assertEquals(2147483647, divide(2147483647, 1))
  }

}