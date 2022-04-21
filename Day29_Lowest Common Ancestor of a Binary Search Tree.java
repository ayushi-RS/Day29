class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q || root==null){
            return root;
        }
        if((p.val<root.val && root.val<q.val) || (q.val<root.val && root.val<p.val)){
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        return left==null?(right==null?null:right):left;
        
    }
}
