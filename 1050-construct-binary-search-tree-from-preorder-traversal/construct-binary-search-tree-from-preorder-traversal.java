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
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
        // new int []{0} --> because we can't pass reference of variable in Java. So, we are using a array as a variable.

    }

    private TreeNode bstFromPreorder(int []preorder, int bound, int []i){
        if(i[0]==preorder.length || preorder[i[0]] > bound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i[0]]);
        i[0]++; // increment pointer to next element in array
        root.left = bstFromPreorder(preorder, root.val, i);
        root.right = bstFromPreorder(preorder, bound, i);

        return root;
    }
}