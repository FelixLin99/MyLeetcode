package StackAndQueue;

import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2117:48
 */
public class ValidParentheses_Easy_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c== '['){
                stack.push(c);
            }
            else{
                if (stack.isEmpty() == true){
                    return false;
                }
                else{
                    char left = stack.pop();
                    boolean b1 = (c == ')' && left != '(');
                    boolean b2 = (c == ']' && left != '[');
                    boolean b3 = (c == '}' && left != '{');
                    if (b1 || b2 || b3){
                        return false;
                    }

                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
