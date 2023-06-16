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
    List<Integer> list= new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head= new TreeNode();
        inOrder(root);
        TreeNode cur= head;
        for(int i:list){
            cur.right= new TreeNode(i);
            cur = cur.right;
        }
        return head.right;
    }
    
    
    public void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    
    
}