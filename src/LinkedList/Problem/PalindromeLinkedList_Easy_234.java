package LinkedList.Problem;

import LinkedList.DataStructure.ListNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1517:55
 */
class PalindromeLinkedList_Easy_234 {
    public static boolean isPalindrome(ListNode head) {
        //
        if (head == null || head.next == null){
            return true;
        }

        // count N and find middle space
        ListNode fast = head.next.next;
        ListNode slow = head;
        ListNode next = head.next;
        slow.next = null;
        while (fast!=null && fast.next!=null){
            ListNode tmp = next;
            next = next.next;
            tmp.next =slow;
            slow = tmp;
            fast = fast.next.next;
        }

        // total number of nodes is even, the "next" is the head of thr other part
        if (fast == null){}
        // total number of nodes is odd, the "next" is the head of thr other part
        else if (fast.next == null){
            next = next.next;
            ;
        }

        while(slow != null){
            if(slow.val != next.val){
                return false;
            }
            slow = slow.next;
            next = next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.addNode(2);
        l.addNode(2);
        l.addNode(1);
        ListNode[] li = new ListNode[3];

        boolean palindrome = isPalindrome(l);
        System.out.println(palindrome);
    }
}
