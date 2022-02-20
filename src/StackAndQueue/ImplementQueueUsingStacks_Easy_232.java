package StackAndQueue;

import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2020:17
 */
public class ImplementQueueUsingStacks_Easy_232 {
    public class MyQueue {

        private Stack<Integer> in = new Stack<>();
        private Stack<Integer> out = new Stack<>();

        public void push(int x) {
            in.push(x);

        }

        public int pop() {
            in2out();
            return out.pop();
        }

        public int peek() {
            in2out();
            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }

        // helper method
        private void in2out(){
            if (out.isEmpty()){
                while(!in.isEmpty()){
                    out.push(in.pop());
                }
            }
        }
    }


}
