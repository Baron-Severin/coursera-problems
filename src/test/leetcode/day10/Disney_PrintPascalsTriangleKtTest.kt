package leetcode.day10

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Disney_PrintPascalsTriangleKtTest {

  @Test fun one() {
    assertEquals("1", createTriangle(1))
    assertEquals("11", createTriangle(2))
    assertEquals("121", createTriangle(3))
    assertEquals("1331", createTriangle(4))
    assertEquals("14641", createTriangle(5))
    assertEquals("15101051", createTriangle(6))
  }

}