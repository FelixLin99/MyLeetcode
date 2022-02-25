package DynamicProgramming;

import java.util.Arrays;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2417:58
 */
public class MinimumPathSum_Medium_64 {
    public int minPathSum(int[][] grid) {
        // top-down TC: O(n*n);  SC: O(n*n+n)

        // bottom-up TC: O(n*n);  SC: O(n + n)
        int r = grid.length;
        int c = grid[0].length;
        int[] dp = new int[c];


        //initialize dp
        dp[0] = grid[0][0];
        for(int i=1; i<c; i++){
            dp[i] = dp[i-1] + grid[0][i];
        }


        for(int currRow = 1; currRow < r; currRow++){
            dp[0] += grid[currRow][0];
            for(int currCol = 1; currCol < c; currCol++){
                dp[currCol] = Integer.min(dp[currCol-1], dp[currCol]) + grid[currRow][currCol];
            }
        }

        return dp[c-1];
    }

    public static void main(String[] args) {
        int[][] t = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int i = new MinimumPathSum_Medium_64().minPathSum(t);
        System.out.println(i);
    }



        }
