package StackAndQueue;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/21 19:00
 */
public class NextGreaterElementII_Medium_503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] output = new int[n];
        Arrays.fill(output, -1);
        for(int i = 0; i < 2*n; i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                output[stack.pop()] = nums[i%n];
            }


            if(i < n){
                stack.push(i);
            }
        }
        return output;
    }
}
