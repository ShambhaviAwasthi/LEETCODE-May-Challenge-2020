# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE 
# DAY 7: Cousins in Binary Tree


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
      def isCousins(self, root: 'TreeNode', x: 'int', y: 'int') -> 'bool':
        self.px, self.dx = None, -1
        self.py, self.dy = None, -2
        def traversal(root, parent, d):
            if not root: return
            if root.val == x: 
                self.px, self.dx = parent, d
            if root.val == y:
                self.py, self.dy = parent, d
            traversal(root.left, root, d + 1)
            traversal(root.right, root, d + 1)
        traversal(root, None, 0)
        return self.dx == self.dy and self.px != self.py