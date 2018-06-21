package leetcode.day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _13_RomanToIntegerKtTest {

  @Test fun one() {
    assertEquals(3, romanToInt("III"))
  }

  @Test fun two() {
    assertEquals(4, romanToInt("IV"))
  }


  @Test fun three() {
    assertEquals(9, romanToInt("IX"))
  }

  @Test fun four() {
    assertEquals(58, romanToInt("LVIII"))
  }

  @Test fun five() {
    assertEquals(1994, romanToInt("MCMXCIV"))
  }
}