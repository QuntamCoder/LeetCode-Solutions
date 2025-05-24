package Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PreOrder144{
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);               
            preorderHelper(node.left, result);  
            preorderHelper(node.right, result); 
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }


    private TreeNode insert(TreeNode root,int val){
        if(root==null){
            root=insert(root, val);
        }
        if(val>root.val){
            root.right=insert(root, val);
        }else{
            root.left=insert(root, val);
        }
        return root;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.inse

        List<Integer> output = preorderTraversal(root);
        System.out.println(output);  // Output: [1, 2, 3]

    }
}