package leetcode.day14

import java.util.*

class TreeNode(var `val`: Int = 0,
  var left: TreeNode? = null,
  var right: TreeNode? = null) {
  override fun equals(other: Any?): Boolean {
    if (other == null) return false
    if (other !is TreeNode) return false
    return this.`val` == other.`val` &&
        ((this.left == null && other.left == null) ||
            (this.left?.equals(other.left) ?: false)) &&
        ((this.right == null && other.right == null) ||
            (this.right?.equals(other.right) ?: false))
  }

  override fun toString(): String {
    return "${left?.toString()} $`val` ${right?.toString()}"
  }

}

// Iterative solution
fun inorderTraversal(root: TreeNode?): List<Int> {
  val list = mutableListOf<Int>()
  val nodes = ArrayDeque<TreeNode>()
  root?.let { nodes.addFirst(it) }

  while (nodes.isNotEmpty()) {
    val top = nodes.removeFirst() ?: continue
    if (top.left == null && top.right == null) {
      list += top.`val`
    } else {
      top.right?.let { nodes.addFirst(it) }
      nodes.addFirst(top)
      top.left?.let { nodes.addFirst(it) }
      top.left = null
      top.right = null
    }
  }
  return list
}

// recursive
//fun inorderTraversal(root: TreeNode?, list: MutableList<Int> = mutableListOf()): List<Int> {
//  if (root != null) {
//    inorderTraversal(root.left, list)
//    list += root.`val`
//    inorderTraversal(root.right, list)
//  }
//  return list
//}