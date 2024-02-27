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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDiam = diameterOfBinaryTree(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight + rightHeight;
        return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right) + 1;
    }
}