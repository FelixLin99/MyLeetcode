package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2715:10
 */
public class BinaryTreePreorderTraversal_Easy_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            if (currNode == null){
                continue;
            }
            output.add(currNode.val);
            stack.push(currNode.right);
            stack.push(currNode.left);
        }
        return output;
    }





}
