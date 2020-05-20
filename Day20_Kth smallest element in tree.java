// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 20: Kth smallest node in Tree

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
    ArrayList<Integer> al=new ArrayList<Integer>();
    public ArrayList<Integer> Inorder(TreeNode root){
        if(root !=null){
            Inorder(root.left);
            System.out.print(root.val);
        al.add(root.val);
        Inorder(root.right); 
        }
        return al;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a=Inorder(root);
        return a.get(k-1);
        
    }
}