package leetcode.day4

import leetcode.day3.toNodes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _23_MergeKLinkedListsKtTest {

  @Test fun one() {
    val input1 = listOf(1, 4, 5).toNodes()
    val input2 = listOf(1, 3, 4).toNodes()
    val input3 = listOf(2, 6).toNodes()
    val expect = listOf(1, 1, 2, 3, 4, 4, 5, 6).toNodes()
    assertEquals(expect, mergeKLists(arrayOf(input1, input2, input3)))
  }
}