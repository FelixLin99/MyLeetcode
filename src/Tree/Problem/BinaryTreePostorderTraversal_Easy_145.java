package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2715:26
 */
public class BinaryTreePostorderTraversal_Easy_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        // preorder: root -> left -> right
        // postorder: left -> right -> root, which is the reversion of root -> right -> left. Kind of a preorderTraversal.
        // one method is to use Collections.reverse() to reverse the outut of kind-of preorderTraversal. Or we can use LinkedList.addFirst() to directly build a reverse List.

        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            if (currNode == null){
                continue;
            }

            output.addFirst(currNode.val);
            stack.push(currNode.left);
            stack.push(currNode.right);
        }
        return output;
    }


}
