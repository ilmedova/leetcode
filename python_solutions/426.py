"""
# Definition for a Node.
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
"""


class Solution:
    def treeToDoublyList(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if root is None: return None
        elements = self.inorderTraversal(root, [])
        for i in range(len(elements) - 1):
            elements[i].right = elements[i + 1]
            elements[i + 1].left = elements[i]
        elements[-1].right = elements[0]
        elements[0].left = elements[-1]
        return elements[0]

    def inorderTraversal(self, root, arr):
        if root is None: return arr
        self.inorderTraversal(root.left, arr)
        arr.append(root)
        self.inorderTraversal(root.right, arr)
        return arr