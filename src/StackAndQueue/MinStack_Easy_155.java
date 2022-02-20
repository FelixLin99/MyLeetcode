package StackAndQueue;

import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2020:58
 */
public class MinStack_Easy_155 {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        private int minVal;

        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
            minVal = Integer.MAX_VALUE;
        }

        public void push(int val) {
            stack.push(val);
            minVal = (minVal > val)? val: minVal;
            minStack.push(minVal);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
            minVal = minStack.isEmpty()? Integer.MAX_VALUE: minStack.peek();

        }

        public int top() {
            return stack.peek();

        }

        public int getMin() {
            return minVal;
        }
    }


}
