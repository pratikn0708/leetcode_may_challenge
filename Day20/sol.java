class Solution {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode res = helper(root, k); 
        return res.val;
    }
    
    public  TreeNode helper(TreeNode root, int k) { 
        // base case 
        if (root == null) 
            return null; 
       
        // search in left subtree 
        TreeNode left = helper(root.left, k); 
       
        // if k'th smallest is found in left subtree, return it 
        if (left != null) 
            return left; 
       
        // if current element is k'th smallest, return it 
        count++; 
        if (count == k) 
            return root; 
       
        // else search in right subtree 
        return helper(root.right, k); 
    } 
}