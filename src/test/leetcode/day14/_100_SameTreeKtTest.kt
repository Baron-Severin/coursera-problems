package leetcode.day14

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class _100_SameTreeKtTest {

  @Test fun one() {
    val input1 = TreeNode(1, TreeNode(2), TreeNode(3))
    val input2 = TreeNode(1, TreeNode(2), TreeNode(3))
    assertTrue { isSameTree(input1, input2) }
  }


}