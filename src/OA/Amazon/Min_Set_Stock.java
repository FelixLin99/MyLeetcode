package OA.Amazon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/9/2 15:54
 */
public class Min_Set_Stock {
    private static int helper(int[] arr){
        int totalSum = 0;
        int currSum = 0;
        int resMon = 1;
        int resMinSum = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i : arr){
            totalSum += i;
        }
        for(int i = 1; i < n; i++){
            currSum += arr[i-1];
            int currStockPrice = Math.abs((int) (currSum / i) - (int)((totalSum-currSum) / n-i));
            if (currStockPrice < resMinSum){
                resMinSum = currStockPrice;
                resMon = i;
            }
        }

        return resMon;
    }


    public static void main(String[] args) {

        int[][] a = new int[][]{{2,1},{0,1}};
        Arrays.sort(a,(x,y) ->{
            return x[0]-y[0];
        });
        LinkedList<int[]> b = new LinkedList<>();


    }
}
