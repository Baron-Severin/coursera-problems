package leetcode.day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _6_ZigZagConversionKtTest {

  @Test fun convert() {
    assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3))
    assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4))
    assertEquals("A", convert("A", 1))
  }

  @Test
  fun shouldPrint() {
    for (i in 0 until 4) {
      for (j in 0 until 4) {
        println("Should print $i $j: ${shouldPrint(i, j, 4)}")
      }
    }
  }

  @Test
  fun getColumns() {
    assertEquals(7, getColumns("PAYPALISHIRING", 4))
    assertEquals(7, getColumns("PAYPALISHIRING", 3))
  }
}