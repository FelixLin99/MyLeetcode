package OA.Amazon;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/13 21:58
 */
public class PlaceZeroAndOne {
    private static int helper(int[] arr){

        //O(n)
        int moveZeroToLeftCnt = 0;
        int moveOneToLeftCnt = 0;
        int currZeroIdx = -1;
        int currOneIdx = -1;

        for(int i = 0; i <arr.length; i++){
            if(arr[i] == 1){
                currOneIdx++;
                moveOneToLeftCnt += i - currOneIdx;
            }
            else{
                currZeroIdx++;
                moveZeroToLeftCnt += i - currZeroIdx;
            }
        }

        return Integer.min(moveZeroToLeftCnt, moveOneToLeftCnt);
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(helper(new int[]{1,1,1,1,0,1,0,1})));
        int[] ints = {1, 2, 3};
        int i = 1;
        long b = i;

    }
}
