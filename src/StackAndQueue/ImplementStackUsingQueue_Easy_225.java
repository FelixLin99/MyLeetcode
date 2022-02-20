package StackAndQueue;

import java.util.LinkedList;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2020:39
 */
public class ImplementStackUsingQueue_Easy_225 {

    public class MyStack {
        private LinkedList<Integer> deque = new LinkedList<>();
        // only use add(addFirst), pop(removeLast)

        public void push(int x) {
            deque.push(x);
        }

        public int pop() {
            for(int i = 1; i<size(); i++){
                deque.push(deque.pop());
            }
            return deque.pop();
        }
        public int top() {
            for(int i = 1; i<size(); i++){
                deque.push(deque.pop());
            }
            Integer firstone = deque.pop();
            deque.push(firstone);
            return firstone;
        }

        public boolean empty() {
            return deque.isEmpty();

        }

        public int size() {
            return deque.size();

        }


    }


}
