package leetcode.day18

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _56_MergeIntervalsKtTest {

  @Test fun one() {
    val input = listOf(Interval(1,3),Interval(2,6),Interval(8,10),Interval(15,18))
    val output = listOf(Interval(1,6),Interval(8,10),Interval(15,18))
    assertEquals(output, merge(input))
  }

}