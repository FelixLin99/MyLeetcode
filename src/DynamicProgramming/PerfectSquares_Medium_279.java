package DynamicProgramming;

import java.util.Arrays;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2517:45
 */
public class PerfectSquares_Medium_279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i))){
                dp[i] = 1;
                continue;
            }
            for (int j = 1; j*j < i; j++){
                dp[i] = Integer.min(dp[i], 1+ dp[i-j*j]);
            }
        }
        return dp[n];
    }
}
