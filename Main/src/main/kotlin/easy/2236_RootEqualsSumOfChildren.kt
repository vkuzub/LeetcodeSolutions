package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun checkTree(root: TreeNode?) = root?.`val`!! == (root.left?.`val`!! + root.right?.`val`!!)

fun main() {
    println(
        checkTree(
            TreeNode(10).apply {
                left = TreeNode(4)
                right = TreeNode(6)
            }
        )
    )
}