package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/9 12:03
 */
public class ConvertSortedArraytoBinarySearchTree_Easy_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1){
            return new TreeNode(nums[0]);
        }
        if (nums.length == 2){
            TreeNode left = new TreeNode(nums[0]);
            return new TreeNode(nums[nums.length-1], left, null);
        }

        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, 1+ nums.length / 2, nums.length));
        return root;
    }
}
