package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/514:07
 */
public class MaximumLengthofPairChain_Medium_646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int output = 1;
        int lastOne = pairs[0][1];
        for( int i = 1; i< pairs.length; i++){
            if (pairs[i][0] >lastOne){
                output++;
                lastOne = pairs[i][1];
            }
        }
        return output;
    }




}
