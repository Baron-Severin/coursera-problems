package leetcode.day19

import generateMatrix
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _59_SpiralMatrix2KtTest {

  @Test fun one() {
    val input = 3
    val output = listOf(
        listOf(1,2,3),
        listOf(8,9,4),
        listOf(7,6,5)
    )
    assertEquals(output, generateMatrix(input).map { it.toList() })
  }


}