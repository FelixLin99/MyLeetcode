package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/15 20:06
 */
public class NonoverlappingIntervals_Medium_435 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new myComparator());
        int cnt = 0;
        int loc = 0;
        while(loc < points.length){
            int intervalEnd = points[loc][1];
            while(loc < points.length && points[loc][0] <= intervalEnd){
                loc++;
            }
            cnt++;
        }
        return cnt;
    }


    private class myComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[1] < o2[1] ? -1 : (
                    o1[1] > o2[1] ? 1 : 0);
        }
    }
}
