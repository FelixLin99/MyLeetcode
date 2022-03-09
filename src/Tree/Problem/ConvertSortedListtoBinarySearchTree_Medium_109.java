package Tree.Problem;

import LinkedList.DataStructure.ListNode;
import Tree.DataStructure.TreeNode;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/3/9 14:49
 */
public class ConvertSortedListtoBinarySearchTree_Medium_109 {
    public TreeNode sortedListToBST(ListNode head) {
        return buildBST(head, null);
    }

    public TreeNode buildBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head == tail){
            return null;
        }
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }

        // now, slow point to the mid node which should be the root of the BST;
        TreeNode root = new TreeNode(slow.val);
        root.left = buildBST(head, slow);
        root.right = buildBST(slow.next, tail);
        return root;
    }
}
