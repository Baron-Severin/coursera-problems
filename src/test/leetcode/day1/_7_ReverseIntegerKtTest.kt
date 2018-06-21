package leetcode.day1

import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class _7_ReverseIntegerKtTest {

  @Test
  fun reverse() {
    assertEquals(321, reverse(123))
    assertEquals(-321, reverse(-123))
    assertEquals(21, reverse(120))
    assertEquals(0, reverse(1_534_236_469))
    assertEquals(0, reverse(-2_147_483_648))
  }

  @Test
  fun reverseFast() {
    assertEquals(321, reverseFast(123))
    assertEquals(-321, reverseFast(-123))
    assertEquals(21, reverseFast(120))
    assertEquals(0, reverseFast(1_534_236_469))
    assertEquals(0, reverseFast(-2_147_483_648))
  }

  @Test fun speedTest() {
    val slow = measureNanoTime {
      reverse(Integer.MAX_VALUE / 10)
    }
    val fast = measureNanoTime {
      reverseFast(Integer.MAX_VALUE / 10)
    }
    val pattern = "%1$15s"

    println("Slow: ${pattern.format(slow)}")
    println("Fast: ${pattern.format(fast)}")

    assertTrue { fast < slow }
  }
}