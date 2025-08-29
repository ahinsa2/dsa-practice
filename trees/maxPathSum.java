class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxPathSum(self, root):
        self.max_sum = float("-inf")

        def dfs(node):
            if not node:
                return 0
            left = max(dfs(node.left), 0)
            right = max(dfs(node.right), 0)

            # update max path
            self.max_sum = max(self.max_sum, node.val + left + right)

            # return best single path
            return node.val + max(left, right)

        dfs(root)
        return self.max_sum

# Example
root = TreeNode(-10)
root.left = TreeNode(9)
root.right = TreeNode(20, TreeNode(15), TreeNode(7))

print(Solution().maxPathSum(root))
