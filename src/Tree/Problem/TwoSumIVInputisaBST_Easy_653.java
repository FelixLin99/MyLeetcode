package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/14 13:27
 */
public class TwoSumIVInputisaBST_Easy_653 {
    public boolean findTarget(TreeNode root, int k) {
        // HashMap O(n)
        HashSet<Integer> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(set.contains(k-node.val)){
                return true;
            }
            set.add(node.val);
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return false;
    }

}
