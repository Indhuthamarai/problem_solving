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
    public void leaves(TreeNode r,List<Integer> res){
        if(r==null){
            return;
        }
        if(r.left==null && r.right==null){
            res.add(r.val);
        }
        leaves(r.left,res);
        leaves(r.right,res);
    }
    public boolean leafSimilar(TreeNode p, TreeNode q) {
        List<Integer> res=new ArrayList<>();
        List<Integer> res1=new ArrayList<>();
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        leaves(p,res);
        leaves(q,res1);
        return res.equals(res1);
    }
}