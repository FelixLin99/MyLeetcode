package StackAndQueue;

import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2118:18
 */
public class DailyTemperatures_Medium_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        // My solution  beats 96%
        int[] output = new int[temperatures.length];
        for(int i = temperatures.length-2; i>=0; i--){
            int j = i+1;
            while(true){
                if(temperatures[j] > temperatures[i]){
                    output[i] = j-i;
                    break;
                }
                if(output[j] == 0){
                    break;
                }
                j += output[j];
            }
        }
        return output;

//        // Stack beats 20%
//        int [] output = new int[temperatures.length];
//        Stack<Integer> stack = new Stack<>();
//        // from the last one of temperatures and then move to the front. we use stack to record the numbers of days whose temperature are larger than current day.
//        for (int currDay = temperatures.length-1; currDay >= 0; currDay--) {
//            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[currDay]){
//                stack.pop();
//            }
//            output[currDay] = (stack.isEmpty())? 0 : stack.peek()-currDay;
//            stack.push(currDay);
//        }
//        return output;
    }
}
