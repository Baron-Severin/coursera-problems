package algorithmic.toolbox.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LastDigitFibonacciKtTest {

  @Test
  fun lastFibonacci() {
    assertEquals(0, lastFibonacci(0))
    assertEquals(1, lastFibonacci(1))
    assertEquals(5, lastFibonacci(10))
    assertEquals(4, lastFibonacci(12))
    assertEquals(5, lastFibonacci(200))
    assertEquals(9, lastFibonacci(331))
    assertEquals(6, lastFibonacci(99999))
  }
}