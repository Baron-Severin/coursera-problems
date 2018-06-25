package leetcode.day6

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _393_Utf8ValidationKtTest {

  @DisplayName("Valid UTF8") @Nested inner class ValidUtf8 {

    @Test fun one() {
      val arr = intArrayOf(197, 130, 1)
      val expected = true
      assertEquals(expected, validUtf8(arr))
    }

    @Test fun two() {
      val arr = intArrayOf(235, 140, 4)
      val expected = false
      assertEquals(expected, validUtf8(arr))
    }

    @Test fun three() {
      val arr = intArrayOf(255)
      val expected = false
      assertEquals(expected, validUtf8(arr))
    }

    @Test fun four() {
      val arr = intArrayOf(237)
      val expected = false
      assertEquals(expected, validUtf8(arr))
    }

    @Test fun five() {
      val arr = intArrayOf(145)
      val expected = false
      assertEquals(expected, validUtf8(arr))
    }

    @Test fun six() {
      val arr = intArrayOf(250,145,145,145,145)
      val expected = false
      assertEquals(expected, validUtf8(arr))
    }

  }

  @DisplayName("To Bits") @Nested inner class ToBits {

    @Test fun one() {
      val arr = intArrayOf(197, 130, 1)
      val expected = listOf("11000101", "10000010", "00000001")
      arr.forEachIndexed { i, num -> assertEquals(expected[i], num.toBits()) }
    }
  }

  @Nested inner class Validate {

    @Test fun one() {
      val strs = listOf("11000101", "10000010", "00000001")
      val expected = true
      assertEquals(expected, validate(strs))
    }

    @Test fun two() {
      val strs = listOf("11101011", "10001100", "00000100")
      val expected = false
      assertEquals(expected, validate(strs))
    }



  }
}