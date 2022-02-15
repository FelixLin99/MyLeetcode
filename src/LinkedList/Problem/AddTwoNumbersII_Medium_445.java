package LinkedList.Problem;

import LinkedList.DataStructure.ListNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/150:53
 */
public class AddTwoNumbersII_Medium_445 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long decimal1 = toDecimal(l1, 0);
        long decimal2 = toDecimal(l2, 0);
        long sum = decimal1 + decimal2;
        ListNode output = (sum == 0)? new ListNode(0) : null;
        while(sum != 0){
            long digit = sum % 10;
            sum = (sum - digit) / 10;
            ListNode tmp = new ListNode((int)digit, output);
            output = tmp;
        }
        return output;
    }

    public static long toDecimal(ListNode l, long front){
        if(l.next == null){
            return front + l.val;
        }
        return toDecimal(l.next, 10*(front +l.val));
    }

    public static void main(String[] args) {
        // make data: l1 = [3,9,9,9,9,9,9,9,9,9]; l2 = [7]
        ListNode l1 = new ListNode(3);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);

        ListNode l2 = new ListNode(7);

        ListNode listNode = addTwoNumbers(l1, l2);
        String s = listNode.toString();
        System.out.println(s);
    }
}
