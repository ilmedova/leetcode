# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None: return 0
        return max(self.depthCounter(root.left, 1), self.depthCounter(root.right, 1))

    def depthCounter(self, root, count):
        if root is None: return count
        if root.left is None and root.right is None: return count+1
        return max(self.depthCounter(root.left, count + 1), self.depthCounter(root.right, count + 1))