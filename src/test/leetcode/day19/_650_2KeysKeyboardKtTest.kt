package leetcode.day19

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _650_2KeysKeyboardKtTest {

  @Test fun one() {
    assertEquals(3, minSteps(3))
  }

  @Test fun all() {
    listOf(
        1 to 0,
        2 to 2,
        3 to 3,
        4 to 4,
        5 to 5,
        6 to 5,
        7 to 7,
        8 to 6,
        9 to 6,
        10 to 7,
        11 to 11,
        12 to 7,
        13 to 13,
        14 to 9,
        15 to 8
    ).forEach { test(it) }
  }
  
  private fun test(inputs: Pair<Int, Int>) {
    assertEquals(inputs.second, minSteps(inputs.first), "Tested ${inputs.first}")
  }
  
  
}
