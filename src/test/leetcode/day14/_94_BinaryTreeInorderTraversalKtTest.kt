package leetcode.day14

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _94_BinaryTreeInorderTraversalKtTest {

  @Test fun one() {
    val input = TreeNode(1, null, TreeNode(2, TreeNode(3, null, null), null))
    val output = listOf(1,3,2)
    assertEquals(output, inorderTraversal(input))
  }

}
