package algorithmic.toolbox.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FibonacciNumberTest {

  @Test
  fun testFibonacci() {
    assertEquals(0, fibonacci(0))
    assertEquals(1, fibonacci(1))
    assertEquals(55, fibonacci(10))
    assertEquals(144, fibonacci(12))
  }
}
