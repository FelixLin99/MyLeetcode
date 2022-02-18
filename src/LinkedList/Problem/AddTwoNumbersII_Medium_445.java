package LinkedList.Problem;

import LinkedList.DataStructure.ListNode;
import sun.awt.image.ImageWatched;

import java.util.List;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/150:53
 */
public class AddTwoNumbersII_Medium_445 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = buildStack(l1);
        Stack<Integer> stack2 = buildStack(l2);
        ListNode output = null;
        boolean surplus = false;

        while(!stack1.empty() || !stack2.empty()){
            int digit1 = (stack1.empty()) ? 0 : stack1.pop();
            int digit2 = (stack2.empty()) ? 0 : stack2.pop();
            int sum = (surplus)? digit1 + digit2 + 1: digit1 + digit2;
            if (sum >= 10){
                sum = sum % 10;
                surplus = true;
            }
            else{
                surplus = false;
            }
            ListNode newHead = new ListNode(sum, output);
            output = newHead;
        }
        return output;
    }

    public static Stack<Integer> buildStack(ListNode l){
        Stack<Integer> stack = new Stack<>();
        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }
        return stack;


    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.addNode(8);
        l1.addNode(9);

        ListNode l2 = new ListNode(2);
        l2.addNode(2);
        l2.addNode(3);

        ListNode output = addTwoNumbers(l1, l2);
        System.out.println(output.toString());
    }
}
