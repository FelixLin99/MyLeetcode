package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.HashSet;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/14 14:38
 */
public class FindModeinBinarySearchTree_Easy_501 {
    private static int currCnt;
    private static int maxCnt = 1;
    private static TreeNode preNode = null;
    private static HashSet<Integer> modes = new HashSet<>();

    public static int[] findMode(TreeNode root) {
        inOrderTraversalHelper(root);
        int[] output = new int[modes.size()];
        int i = 0;
        for(Integer mode : modes){
            output[i] = mode;
        }
        return output;
    }

    private static void inOrderTraversalHelper(TreeNode node){
        if (node == null){
            return;
        }
        inOrderTraversalHelper(node.left);
        if (preNode != null){
            if (preNode.val == node.val){
                currCnt++;
            } else{
                currCnt = 1;
            }
        }
        else{
            currCnt = 1;
        }
        if (currCnt > maxCnt){
            maxCnt = currCnt;
            modes.clear();
            modes.add(node.val);
        }
        else if (currCnt == maxCnt){
            modes.add(node.val);
        }
        preNode = node;
        inOrderTraversalHelper(node.right);
    }

    public static void main(String[] args) {
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, right);
        int[] mode = findMode(root);
        for(int i : mode){
            System.out.println(i);
        }
    }

}
