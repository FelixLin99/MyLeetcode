package TwoPointers.Problem;

import LinkedList.DataStructure.ListNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1821:31
 */
public class LinkedListCycle_Easy_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode front = head.next.next;
        while(head != front){
            if (front == null || front.next == null){
                return false;
            }
            head = head.next;
            front = front.next.next;
        }
        return true;
    }
}
