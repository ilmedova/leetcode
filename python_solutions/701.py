# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from typing import Optional


class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if root is None:
            root = TreeNode(val)
            return root
        self.insertIntoBSTHelper(root, val)
        return root

    def insertIntoBSTHelper(self, root: Optional[TreeNode], val: int):
        if root.val < val and root.right is None:
            root.right = TreeNode(val)
            return
        elif root.val < val and root.right is not None:
            return self.insertIntoBSTHelper(root.right, val)
        elif root.val > val and root.left is None:
            root.left = TreeNode(val)
            return
        else:
            return self.insertIntoBSTHelper(root.left, val)