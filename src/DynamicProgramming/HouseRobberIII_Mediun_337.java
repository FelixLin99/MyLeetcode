package DynamicProgramming;

import Tree.DataStructure.TreeNode;

import java.util.HashMap;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2619:19
 */
public class HouseRobberIII_Mediun_337 {
    private HashMap<TreeNode, Integer> dp = new HashMap<>();

    //     public int rob(TreeNode root) {
//
//         if (root == null){
//             return 0;
//         }
//         if (dp.containsKey(root)){
//             return dp.get(root);
//         }

//         int tmp = root.val;
//         if(root.left != null){
//             tmp += rob(root.left.left) + rob(root.left.right);
//         }
//         if(root.right != null){
//             tmp += rob(root.right.left) + rob(root.right.right);
//         }
//         int best = Integer.max(rob(root.left)+rob(root.right), tmp);
//         dp.put(root, best);

//         return best;

//     }

    public int rob(TreeNode root) {
        int ans[] = robHouse(root);
        return Math.max(ans[0],ans[1]);
    }

    public int[] robHouse(TreeNode root){
        if(root==null){
            return new int[2];
        }

        int left[] = robHouse(root.left);
        int right[] = robHouse(root.right);

        int ans[] = new int[2];

        ans[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        ans[1] = root.val+left[0]+right[0];

        return ans;
    }

}
