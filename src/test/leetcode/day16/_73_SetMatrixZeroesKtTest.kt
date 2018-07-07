package leetcode.day16

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _73_SetMatrixZeroesKtTest {

  @Test fun one() {
    val input =
        arrayOf(
            intArrayOf(1,1,1),
            intArrayOf(1,0,1),
            intArrayOf(1,1,1)
        )
    val output =
        arrayOf(
            intArrayOf(1,0,1),
            intArrayOf(0,0,0),
            intArrayOf(1,0,1)
        )
    setZeroes(input)
    assertEquals(output.map { it.toList() }, input.map { it.toList() })
  }

  @Test fun two() {
    val input =
        arrayOf(
            intArrayOf(0,1,2,0),
            intArrayOf(3,4,5,2),
            intArrayOf(1,3,1,5)
        )
    val output =
        arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,4,5,0),
            intArrayOf(0,3,1,0)
        )
    setZeroes(input)
    assertEquals(output.map { it.toList() }, input.map { it.toList() })
  }

  @Test fun three() {
    val input =
        arrayOf(
            intArrayOf(0,1)
        )
    val output =
        arrayOf(
            intArrayOf(0,0)
        )
    setZeroes(input)
    assertEquals(output.map { it.toList() }, input.map { it.toList() })
  }

  @Test fun four() {
    val input =
        arrayOf(
            intArrayOf(1),
            intArrayOf(0)
        )
    val output =
        arrayOf(
            intArrayOf(0),
            intArrayOf(0)
        )
    setZeroes(input)
    assertEquals(output.map { it.toList() }, input.map { it.toList() })
  }






}