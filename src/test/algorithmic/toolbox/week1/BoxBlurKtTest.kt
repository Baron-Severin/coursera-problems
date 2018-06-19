package algorithmic.toolbox.week1

import org.junit.jupiter.api.Test
import random.algorithms.boxBlur
import kotlin.test.assertEquals

internal class BoxBlurKtTest {


  @Test
  fun test() {
    var input = arrayOf(arrayOf(1, 1, 1),
                      arrayOf(1, 7, 1),
                      arrayOf(1, 1, 1))
    var expect : List<List<Int>> = arrayOf(arrayOf(1)).listIfy()

    assertEquals(expect, boxBlur(input).listIfy())

    input = arrayOf(arrayOf(7, 4, 0, 1),
                    arrayOf(5, 6, 2, 2),
                    arrayOf(6, 10, 7, 8),
                    arrayOf(1, 4, 2, 0))
    expect = arrayOf(arrayOf(5, 4),
                    arrayOf(4, 4)).listIfy()

    assertEquals(expect, boxBlur(input).listIfy())
  }

  private fun Array<Array<Int>>.listIfy() : List<List<Int>> {
    return this.map { it.toList() }.toList()
  }

}