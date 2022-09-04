package OA.Amazon;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/9/1 10:56
 */
public class Prime_Movie_Award {
    public int minGroups(int[] awards, int k){

        Arrays.sort(awards);
        int count = 1;
        int curMin = awards[0];

        for(int i = 1; i < awards.length; i++){
            if(awards[i] - curMin > k){
                curMin = awards[i];
                count++;
            }
        }
        return count;
    }
}
