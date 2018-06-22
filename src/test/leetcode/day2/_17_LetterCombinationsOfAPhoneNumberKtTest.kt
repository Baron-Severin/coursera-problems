package leetcode.day2

import letterCombinations
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _17_LetterCombinationsOfAPhoneNumberKtTest {

  @Test
  fun one() {
    assertEquals(setOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), letterCombinations("23").toSet())
  }
}