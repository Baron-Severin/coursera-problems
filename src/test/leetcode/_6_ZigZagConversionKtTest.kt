package leetcode

import org.junit.jupiter.api.Test

internal class _6_ZigZagConversionKtTest {

  @Test
  fun shouldPrint() {
    for (i in 0 until 4) {
      for (j in 0 until 4) {
        println("Should print $i $j: ${shouldPrint(i, j, 4)}")
      }
    }
  }
}