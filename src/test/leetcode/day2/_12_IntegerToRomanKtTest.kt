package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _12_IntegerToRomanKtTest {

  @Test fun one() {
    assertEquals("III", intToRoman(3))
  }

  @Test fun two() {
    assertEquals("IV", intToRoman(4))
  }

  @Test fun three() {
    assertEquals("IX", intToRoman(9))
  }

  @Test fun four() {
    assertEquals("LVIII", intToRoman(58))
  }

  @Test fun five() {
    assertEquals("MCMXCIV", intToRoman(1994))
  }

}