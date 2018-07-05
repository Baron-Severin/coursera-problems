package leetcode.day14

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
  return p?.`val` == q?.`val` &&
      ((p?.left == null && q?.left == null) || isSameTree(p?.left, q?.left)) &&
      ((p?.right == null && q?.right == null) || (isSameTree(p?.right, q?.right)))
}

