package leetcode.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _8_StringToIntegerKtTest {

  @Test fun one() {
    assertEquals(-42, myAtoi("   -42"))
  }

  @Test fun two() {
    assertEquals(4193, myAtoi("4193 with words"))
  }

  @Test fun three() {
    assertEquals(0, myAtoi("words and 987"))
  }

  @Test fun four() {
    assertEquals(-2147483648, myAtoi("-91283472332"))
  }

  @Test fun five() {
    assertEquals(3, myAtoi("3.14159"))
  }

  @Test fun six() {
    assertEquals(-12, myAtoi("  -0012a42"))
  }

  @Test fun seven() {
    assertEquals(0, myAtoi("-   234"))
  }

  @Test fun eight() {
    assertEquals(0, myAtoi(""))
  }

  @Test fun nine() {
    assertEquals(0, myAtoi(" "))
  }

  @Test fun ten() {
    assertEquals(-5, myAtoi("-5-"))
  }

  @Test fun eleven() {
    assertEquals(-13, myAtoi("-13+8"))
  }

  @Test fun twelve() {
    assertEquals(0, myAtoi(" b11228552307"))
  }

  @Test fun thirteen() {
    assertEquals(12345678, myAtoi("  0000000000012345678"))
  }

  @Test fun fourteen() {
    assertEquals(0, myAtoi("    0000000000000   "))
  }
}