package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2620:42
 */
public class FindBottomLeftTreeValue_Medium_513 {
    // // my solution
    // public int findBottomLeftValue(TreeNode root) {
    //     LinkedList<TreeNode> ll = new LinkedList<>();
    //     ll.addFirst(root);
    //     int output = -1;
    //     while(!ll.isEmpty()){
    //         output = ll.getLast().val;
    //         int size = ll.size();
    //         for (int i = 0; i < size; i++){
    //             TreeNode currNode = ll.removeLast();
    //             if(currNode.left != null){
    //                 ll.addFirst(currNode.left);
    //             }
    //             if(currNode.right != null){
    //                 ll.addFirst(currNode.right);
    //             }
    //         }
    //     }
    //     return output;
    // }


    // concise one
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) queue.add(root.right);
            if (root.left != null) queue.add(root.left);
        }
        return root.val;
    }


}
