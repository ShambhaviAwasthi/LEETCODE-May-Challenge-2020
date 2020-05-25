// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 24: Construct Binary Search Tree from Preorder Traversal


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode();
        root.val=preorder[0];
        TreeNode temp=new TreeNode();
        for(int i=1;i<preorder.length;i++){
            temp=root;
            TreeNode newNode=new TreeNode(preorder[i]);
            while(temp.left!=null || temp.right!=null){
                if(preorder[i]<temp.val){
                    if(temp.left==null)
                        break;
                    temp=temp.left;
                }
                else{
                    if(temp.right==null)
                        break;
                    temp=temp.right;
                    
                }
            }
            if(preorder[i]<temp.val)
                temp.left=newNode;
            else
                temp.right=newNode;
        }
        return root;
    }
}