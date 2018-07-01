package leetcode.day10

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Disney_PrintPascalsTriangleKtTest {

  @Test fun one() {
    assertEquals("1", buildPascal(1))
    assertEquals("11", buildPascal(2))
    assertEquals("121", buildPascal(3))
    assertEquals("1331", buildPascal(4))
    assertEquals("14641", buildPascal(5))
    assertEquals("15101051", buildPascal(6))
  }

}