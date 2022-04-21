class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        TreeNode temp = root;
        
         if(temp.left == null && temp.right == null)
            return targetSum==temp.val;
        
      return hasPathSum(temp.left,targetSum-temp.val)|| hasPathSum(temp.right,targetSum-temp.val);
        
    }
}
