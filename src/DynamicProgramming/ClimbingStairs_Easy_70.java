package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2414:08
 */
public class ClimbingStairs_Easy_70 {
    public int climbStairs(int n) {
        // brutal force is quite simple, I will not write here.
        // Instead, I will use DP here

        // method1: top-down DP, should definite an 1D array to store the result of sub-prblem. TC:O(n) and SC:O(n);


        // method2: bottom-up DP, TC:O(n) and SC:O(1);
        int nMinusTwo = 1; // n = 1
        int nMinusOne = 2; // n = 2
        int output = 0;
        if (n <= 2){
            return n;
        }
        for(int i = 3; i <= n; i++){
            output = nMinusTwo + nMinusOne;
            nMinusTwo = nMinusOne;
            nMinusOne = output;
        }
        return output;
    }
}
