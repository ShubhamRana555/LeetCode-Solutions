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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumPath = new Stack<>();

        path.add(root);
        sumPath.add(root.val);

        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int sumVal = sumPath.pop();

            if(temp.left == null && temp.right == null && targetSum == sumVal){
                return true;
            }

            if(temp.left != null){
                path.add(temp.left);
                sumPath.add(temp.left.val + sumVal);
            }
            if(temp.right != null){
                path.add(temp.right);
                sumPath.add(temp.right.val + sumVal);
            }
        }
        return false;
    }
}